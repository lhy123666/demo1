package com.example.demo1.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Answer)实体类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public class Answer implements Serializable {
    private static final long serialVersionUID = -59746196148934087L;
    
    private Integer id;
    
    private Date createtime;
    
    private Integer createid;
    
    private Integer parentquestionid;
    
    private Integer visibility;
    
    private String text;
    
    private Integer likecount;
    
    private Integer commentcount;


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

    public Integer getParentquestionid() {
        return parentquestionid;
    }

    public void setParentquestionid(Integer parentquestionid) {
        this.parentquestionid = parentquestionid;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

}