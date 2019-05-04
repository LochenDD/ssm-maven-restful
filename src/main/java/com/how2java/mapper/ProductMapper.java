package com.how2java.mapper;

import com.how2java.pojo.Product;
import com.how2java.util.Page;

import java.util.List;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 14:01
 */
public interface ProductMapper {
    void add(Product product);
    void delete(int id);
    void update(Product product);
    Product get(int id);
    List<Product> list();
    List<Product> list(Page page);
    int total();
}
