package com.example.demo1.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Question)实体类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public class Question implements Serializable {
    private static final long serialVersionUID = -44797472287056519L;
    
    private Integer id;
    
    private Date createtime;
    
    private Integer createid;
    
    private Integer status;
    
    private Integer visibility;
    
    private String titile;
    
    private String description;
    
    private Integer answercount;
    
    private Integer likecount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAnswercount() {
        return answercount;
    }

    public void setAnswercount(Integer answercount) {
        this.answercount = answercount;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

}