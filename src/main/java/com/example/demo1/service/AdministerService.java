package com.example.demo1.service;

import com.example.demo1.entity.Administer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Administer)表服务接口
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public interface AdministerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Administer queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Administer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param administer 实例对象
     * @return 实例对象
     */
    Administer insert(Administer administer);

    /**
     * 修改数据
     *
     * @param administer 实例对象
     * @return 实例对象
     */
    Administer update(Administer administer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    Administer adminlogin( String adminNumber, String password);

}