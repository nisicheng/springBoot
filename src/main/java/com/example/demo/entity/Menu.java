package com.example.demo.entity;

public class Menu {
    private Long id;

    private String name;

    private Integer parentid;

    private Integer sortid;

    private String urladdress;

    private Integer permissionid;

    private String menuicon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    public String getUrladdress() {
        return urladdress;
    }

    public void setUrladdress(String urladdress) {
        this.urladdress = urladdress == null ? null : urladdress.trim();
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon == null ? null : menuicon.trim();
    }
}