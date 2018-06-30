package com.example.demo.entity;

import java.util.Date;

public class Feedback {
    private Integer id;

    private String title;

    private String content;

    private Date feedbacktime;

    private Integer userid;

    private Integer state;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}