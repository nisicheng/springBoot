package com.example.demo.entity;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer articleid;

    private String content;

    private String nickname;

    private Integer userid;

    private String userip;

    private Date commentdate;

    private Integer commentstargetcommentsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public Integer getCommentstargetcommentsid() {
        return commentstargetcommentsid;
    }

    public void setCommentstargetcommentsid(Integer commentstargetcommentsid) {
        this.commentstargetcommentsid = commentstargetcommentsid;
    }
}