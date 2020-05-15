package com.example.demo1.service;

import com.example.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-04-16 15:41:46
 */
public interface UserService {





    boolean userRegister(String userName,String userpass,String email, Integer sex, String imge);

    boolean shield(Integer id);

    User userlogin(String userName,String userpass);


}