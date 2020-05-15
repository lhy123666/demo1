package com.example.demo1.service;

import org.apache.ibatis.annotations.Param;

public interface MailServer {
    /**
     * 发送多媒体类型邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendMimeMail(@Param("to") String to, @Param("subject") String subject, @Param("content") String content);

    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}

