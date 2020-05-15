package com.example.demo1.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -81780658917084829L;
    
    private Integer id;
    
    private Date createtime;
    
    private Integer createid;
    
    private String text;
    
    private Integer visibility;
    
    private Integer parentanswerid;
    
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getParentanswerid() {
        return parentanswerid;
    }

    public void setParentanswerid(Integer parentanswerid) {
        this.parentanswerid = parentanswerid;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

}