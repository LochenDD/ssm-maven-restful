package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

import java.util.List;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 13:41
 */
public interface CategoryMapper {
    int add(Category category);

    void delete(int id);

    Category get(int id);

    int update(Category category);

    List<Category> list();

    List<Category> list(Page page);
}
