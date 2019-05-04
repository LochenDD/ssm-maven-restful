package com.how2java.service;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 13:48
 */
public interface CategoryService {
    int add(Category category);

    void delete(int id);

    Category get(int id);

    int update(Category category);

    List<Category> list();

    void addTwo();

    void deleteAll();
}
