package com.example.demo1.controller;

import com.example.demo1.entity.Notification;
import com.example.demo1.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Notification)表控制层
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
@RestController
@RequestMapping("notification")
public class NotificationController {
    /**
     * 服务对象
     */
    @Resource
    private NotificationService notificationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Notification selectOne(Integer id) {
        return this.notificationService.queryById(id);
    }

}