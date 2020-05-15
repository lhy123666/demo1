package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.*;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-04-16 15:41:47
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @RequestMapping(value = {"/loginpage"})
    public String loginpage()
    {
        return "userLogin";
    }

    /**
     * 跳转到用户注册页面
     * @return 注册页面
     */
    @RequestMapping(value = {"/registerpage"})
    public String registerpage(){
        return "userRegister";
    }

    /**
     * 获取用户名与密码，用户登录
     * @return 登录成功页面
     */
    @RequestMapping(value = {"/userLogin"})
    public String userLogin(@RequestParam("username") String username, @RequestParam("userpass") String userpass, HttpServletRequest request){

        User user = userService.userlogin(username,userpass);

        if(user != null){                                                  //登录成功
            request.getSession().setAttribute("session_user",user);     //将用户信息放入session
            return "Main";
        }
        return "redirect:/loginpage";
    }

    @RequestMapping(value = {"/userRegister"})
    public String userRegister(@RequestParam("userName") String userName,@RequestParam("userpass") String userpass, @RequestParam("email") String email, @RequestParam("sex") Integer sex, @RequestParam("imge") String imge, HttpServletRequest request){
        if(userService.userRegister(userName,userpass,email,sex,imge))
        {
            System.out.println("注册成功");
            return "redirect:/loginpage";
        }
        else{
        System.out.println("请重新注册");
        return "redirect:/registerpage";
        }
    }





    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据


    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    } */

}