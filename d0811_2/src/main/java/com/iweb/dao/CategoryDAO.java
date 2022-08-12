package com.iweb.dao;

import com.iweb.pojo.Category;

import java.util.List;

/**
 * @author Byx
 * @Date: 2022/8/11 15:42
 * @description 类的描述介绍
 */
public interface CategoryDAO {

    /**
     * @param category 要添加的分类应用对象
     */
    void  add(Category category);

    /**
     * @param id 分类id
     */
    void delete(int id);

    /**修改分类数据
     * @param category
     */
    void update(Category category);

    /**
     * @param id 参数id
     * @return 根据id获取到的分类对象
     */
    Category get(int id);

    /**对分类信息进行分页查询
     * @param start 查询语句起始截止行数
     * @param count 截止行数
     * @return
     */
    List<Category> listByLimit(int start,int count);

    /**默认查询所有分类
     * @return 查询到的所有分类集合
     */
    List<Category> list();

}
