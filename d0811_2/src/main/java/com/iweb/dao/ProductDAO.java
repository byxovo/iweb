package com.iweb.dao;

import com.iweb.pojo.Product;

import java.util.List;

/**
 * @author Byx
 * @Date: 2022/8/12 10:28
 * @description 类的描述介绍
 */
public interface ProductDAO {

    /**增
     * @param product 要添加的商品对象引用
     */
    void add(Product product);

    /** 根据id删除商品
     * @param id 商品id
     */
    void delete(int id);

    /** 修改伤心数据
     * @param
     */
    void update(Product product);

    /** 根据id获取单个商品对象
     * @param id 参数id 对应分类主键
     * @return 根据id得到的商品对象
     */
    Product get(int id);

    /** 用来对商品信息进行分页查询
     * @param cid 查询的分页id
     * @param start 查询语句起始截止行数
     * @param count 截取行数
     * @return 商品集合
     */
    List<Product> listByLimit(int cid,int start, int count);

    /** 默认查询所有商品
     * @return 查询到的所有分类集合
     */
    List<Product> list();

    /** 根据分类获取指定商品对象
     * @param cid 分类id
     * @return  指定分类下的商品集合
     */
    List<Product> listByCid(int cid);

    public List<Product> list(int cid);
}
