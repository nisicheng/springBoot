package com.example.demo.entity;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private String profile;

    private String content;

    private Integer classificationid;

    private Date releasedate;

    private Date modifydate;

    private Integer authorid;

    private Integer type;

    private String keyword;

    private Integer staticid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getClassificationid() {
        return classificationid;
    }

    public void setClassificationid(Integer classificationid) {
        this.classificationid = classificationid;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getStaticid() {
        return staticid;
    }

    public void setStaticid(Integer staticid) {
        this.staticid = staticid;
    }
}