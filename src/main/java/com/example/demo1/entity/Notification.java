package com.example.demo1.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Notification)实体类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public class Notification implements Serializable {
    private static final long serialVersionUID = 182720322866316903L;
    
    private Integer id;
    
    private Integer notifier;
    
    private Integer reveiver;
    
    private Integer outerid;
    
    private Date createtime;
    
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNotifier() {
        return notifier;
    }

    public void setNotifier(Integer notifier) {
        this.notifier = notifier;
    }

    public Integer getReveiver() {
        return reveiver;
    }

    public void setReveiver(Integer reveiver) {
        this.reveiver = reveiver;
    }

    public Integer getOuterid() {
        return outerid;
    }

    public void setOuterid(Integer outerid) {
        this.outerid = outerid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}