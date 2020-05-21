package com.example.demo1.service;

import com.example.demo1.entity.Question;
import java.util.List;

/**
 * (Question)表服务接口
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
public interface QuestionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Question queryById(Integer id);
    /**
     * 通过标题查询问题
     */
    Question queryByTitle(String title);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Question> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param
     * @return 实例对象
     */
    boolean insert(Integer createid,String titile,String description);

    /**
     * 修改数据
     *
     * @param
     * @return 实例对象
     */
    Question update(String titile,String description);

    List<Question> queryAll1();

    /**
     * 终结问题
     */
    boolean end(Integer id);
    /**
     * 屏蔽问题
     */
    boolean shield(Integer id);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}