package com.example.demo1.service.impl;

import com.example.demo1.entity.Administer;
import com.example.demo1.dao.AdministerDao;
import com.example.demo1.service.AdministerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Administer)表服务实现类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
@Service("administerService")
public class AdministerServiceImpl implements AdministerService {
    @Resource
    private AdministerDao administerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Administer queryById(Integer id) {
        return this.administerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Administer> queryAllByLimit(int offset, int limit) {
        return this.administerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param administer 实例对象
     * @return 实例对象
     */
    @Override
    public Administer insert(Administer administer) {
        this.administerDao.insert(administer);
        return administer;
    }

    /**
     * 修改数据
     *
     * @param administer 实例对象
     * @return 实例对象
     */
    @Override
    public Administer update(Administer administer) {
        this.administerDao.update(administer);
        return this.queryById(administer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.administerDao.deleteById(id) > 0;
    }
    @Override
    public Administer adminlogin(String adminNumber, String password){
        Administer administer=this.administerDao.adminlogin(adminNumber,password);
        return administer;
    }
}