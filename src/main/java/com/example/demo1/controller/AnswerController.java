package com.example.demo1.controller;

import com.example.demo1.entity.Answer;
import com.example.demo1.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Answer)表控制层
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
@RestController
@RequestMapping("answer")
public class AnswerController {
    /**
     * 服务对象
     */
    @Resource
    private AnswerService answerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Answer selectOne(Integer id) {
        return this.answerService.queryById(id);
    }

}