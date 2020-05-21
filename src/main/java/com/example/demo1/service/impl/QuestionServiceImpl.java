package com.example.demo1.service.impl;

import com.example.demo1.dao.AnswerDao;
import com.example.demo1.dao.CommentDao;
import com.example.demo1.entity.Question;
import com.example.demo1.dao.QuestionDao;
import com.example.demo1.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Question)表服务实现类
 *
 * @author makejava
 * @since 2020-04-16 15:41:49
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
    @Resource
    private QuestionDao questionDao;
    private AnswerDao answerDao;
    private CommentDao commentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Question queryById(Integer id) {
        return this.questionDao.queryById(id);
    }

    @Override
    public Question queryByTitle(String title) {
        return this.questionDao.queryByTitle(title);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Question> queryAllByLimit(int offset, int limit) {
        return this.questionDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Question> queryAll1() {
        return this.questionDao.queryAll1();
    }

    /**
     * 新增数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public boolean insert(Integer createid,String titile,String description) {
        questionDao.insert(createid, titile, description);
        return true;
    }

    /**
     * 修改数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public Question update(String titile,String description) {
        questionDao.update(titile, description);
        return queryByTitle(titile);
    }

    @Override
    public boolean end(Integer id) {
        return this.questionDao.end(id) >0;
    }

    @Override
    public boolean shield(Integer id) {
        this.questionDao.shield(id);
        int id1=answerDao.returnid(id);
        answerDao.shield(id1);
        int id2=commentDao.returnid(id1);
        commentDao.shield(id2);
        return true;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.questionDao.deleteById(id) > 0;
    }
}