package com.example.demo1.service.impl;

import com.example.demo1.entity.User;
import com.example.demo1.dao.UserDao;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-04-16 15:41:47
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public boolean userRegister(String userName,String userpass,String email, Integer sex, String imge) {
        User user = new User();
        user.setUsername(userName);
        user.setUserpass(userpass);
        user.setEmail(email);
        user.setSex(sex);
        user.setImge(imge);
        user.setToken(0);
        userDao.adduser(user);
        return true;
    }

    /**
     * 通过主键拉黑用户
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean shield(Integer id) {
        /* if(this.userDao.shield(id) > 0) return true;*/
        userDao.shield(id);
        if(this.userDao.userstatus(id)==2) return true;
         else
             return false;

    }

    @Override
    public User userlogin(String username,String userpass){
        User user = this.userDao.userlogin(username,userpass);
        return user;
    }


}