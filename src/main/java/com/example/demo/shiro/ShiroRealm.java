package com.example.demo.shiro;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cdyoue on
 */
    public class ShiroRealm extends AuthorizingRealm {

        @Autowired
        private UserService userService;

        // 为当前登陆成功的用户授予权限和角色，已经登陆成功了
        @Override
        protected AuthorizationInfo doGetAuthorizationInfo(
                PrincipalCollection principals) {
            String username = (String)principals.getPrimaryPrincipal();
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
            authorizationInfo.setRoles(userService.findRoles(username));
            authorizationInfo.setStringPermissions(userService.findPermissions(username));
            return authorizationInfo;
        }

        // 验证当前登录的用户，获取认证信息
        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(
                AuthenticationToken token) throws AuthenticationException {
            String username = (String) token.getPrincipal(); // 获取用户名
            User user = userService.findByUsername(username);
            if (user == null) {
                throw new UnknownAccountException();
            }
            // 判断帐号是否锁定
            if (Boolean.TRUE.equals(user.getLocked())) {
                // 抛出 帐号锁定异常
                throw new LockedAccountException();
            }

            // 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    user.getUsername(), // 用户名
                    user.getPassword(), // 密码
                    ByteSource.Util.bytes(user.getCredentialsSalt()),// salt=username+salt
                    getName() // realm name
            );
            return authenticationInfo;
        }
        @Override
        public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
            super.clearCachedAuthorizationInfo(principals);
        }

        @Override
        public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
            super.clearCachedAuthenticationInfo(principals);
        }

        @Override
        public void clearCache(PrincipalCollection principals) {
            super.clearCache(principals);
        }

        public void clearAllCachedAuthorizationInfo() {
            getAuthorizationCache().clear();
        }

        public void clearAllCachedAuthenticationInfo() {
            getAuthenticationCache().clear();
        }

        public void clearAllCache() {
            clearAllCachedAuthenticationInfo();
            clearAllCachedAuthorizationInfo();
        }
    }