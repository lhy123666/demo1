package com.example.demo1.service.impl;

import com.example.demo1.service.MailServer;
import com.sun.java.util.jar.pack.Package;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class MailServerImpl implements MailServer {
    @Override
    public void sendMimeMail(String to, String subject, String content) {
        final Logger logger = LoggerFactory.getLogger(this.getClass());

        String from;

        @Override
        public void sendMimeMail(String to, String subject, String content)@Autowired JavaMailSenderImpl mailSender;
        {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = null;
            try {
                helper = new MimeMessageHelper(message, true);
                helper.setFrom(from);
                helper.setSubject(subject);
                helper.setTo(to);
                helper.setText(content, true);
                mailSender.send(message);
                //日志信息
                logger.info("邮件已经发送。");
            } catch (MessagingException e) {
                logger.error("发送邮件时发生异常！", e);
            }

        }

    @Override
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId) {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = null;

            try{
                helper = new MimeMessageHelper(message, true);
                helper.setFrom(from);
                helper.setSubject(subject);
                helper.setTo(to);
                helper.setText(content, true);

                FileSystemResource fs = new FileSystemResource(new com.sun.java.util.jar.pack.Package.File(rscPath));
                helper.addInline(rscId, fs);

                mailSender.send(message);
            }catch (MessagingException e) {
                logger.error("发送邮件时发生异常！", e);
            }
        }

    }
}
