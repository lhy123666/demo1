package com.example.demo1.controller;

import com.example.demo1.entity.Administer;
import com.example.demo1.entity.User;
import com.example.demo1.service.AdministerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * (Administer)表控制层
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
@RestController
@RequestMapping("administer")
public class AdministerController {
    /**
     * 服务对象
     */
    @Resource
    private AdministerService administerService;
    @RequestMapping("/adminloginpage")
    public String adminloginpage()
    {
        return "adminLogin";
    }

    @RequestMapping(value = {"/adminLogin"})
    public String adminLogin(@RequestParam("adminNumber") String adminNumber, @RequestParam("password") String password, HttpServletRequest request){

        Administer administer = administerService.adminlogin(adminNumber,password);

        if(administer != null){                                                  //登录成功
            request.getSession().setAttribute("session_admin",administer);     //将用户信息放入session
            return "index";
        }
        return "redirect:/adminloginpage";
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Administer selectOne(Integer id) {
        return this.administerService.queryById(id);
    }

}