package com.example.demo1.entity;

import java.io.Serializable;

/**
 * (Administer)实体类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public class Administer implements Serializable {
    private static final long serialVersionUID = -60499075760597281L;
    /**
    * auto_increamnt
    */
    private Integer id;
    
    private String adminNumber;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(String adminNumber) {
        this.adminNumber = adminNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}