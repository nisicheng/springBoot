package com.example.demo.entity;

import java.util.Date;

public class Accessinfo {
    private Integer id;

    private String ip;

    private String browser;

    private String systems;

    private Date visittime;

    private String visitaddress;

    private String visitsource;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getSystems() {
        return systems;
    }

    public void setSystems(String systems) {
        this.systems = systems == null ? null : systems.trim();
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public String getVisitaddress() {
        return visitaddress;
    }

    public void setVisitaddress(String visitaddress) {
        this.visitaddress = visitaddress == null ? null : visitaddress.trim();
    }

    public String getVisitsource() {
        return visitsource;
    }

    public void setVisitsource(String visitsource) {
        this.visitsource = visitsource == null ? null : visitsource.trim();
    }
}