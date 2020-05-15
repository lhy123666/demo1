package com.example.demo1.dao;

import com.example.demo1.entity.Notification;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Notification)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public interface NotificationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Notification queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Notification> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param notification 实例对象
     * @return 对象列表
     */
    List<Notification> queryAll(Notification notification);

    /**
     * 新增数据
     *
     * @param notification 实例对象
     * @return 影响行数
     */
    int insert(Notification notification);

    /**
     * 修改数据
     *
     * @param notification 实例对象
     * @return 影响行数
     */
    int update(Notification notification);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}