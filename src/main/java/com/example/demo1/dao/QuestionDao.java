package com.example.demo1.dao;

import com.example.demo1.entity.Question;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Question)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public interface QuestionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Question queryById(Integer id);


    /**
     * 通过标题来搜索问题
     * @param title
     * @return
     */
    Question queryByTitle(String title);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Question> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
    /**
     *展示问题按时间排序
     */
    List<Question> queryAll1();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param question 实例对象
     * @return 对象列表
     */
    List<Question> queryAll(Question question);

    /**
     * 新增数据
     *
     * @param
     * @return 影响行数
     */
    int insert(@Param("createid") Integer createid,@Param("titile") String titile, @Param("description") String description);

    /**
     * 修改数据
     *
     * @param
     * @return 影响行数
     */
    int update(@Param("titile") String titile, @Param("description") String description);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 终结问题
     */
    int end(Integer id);
    /**
     * 屏蔽问题
     */
    int shield(Integer id);

}