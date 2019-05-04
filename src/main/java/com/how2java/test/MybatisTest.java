package com.how2java.test;

import java.util.List;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;
import com.how2java.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.util.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

//    @Autowired
//    private CategoryMapper categoryMapper;
//    @Autowired
//    private ProductMapper productMapper;
    @Autowired
    CategoryService categoryService;

    @Test
    public void addTwo(){
        categoryService.deleteAll();
        categoryService.addTwo();
    }
//
//    @Test
//    public void testAdd() {
//        for (int i = 0; i < 100; i++) {
//            Category category = new Category();
//            category.setName("new Category " + i);
//            categoryMapper.add(category);
//        }
//    }
//
//    @Test
//    public void testAddProduct() {
//        for (int i = 0; i < 100; i++) {
//            Product product = new Product();
//            product.setName("new Product " + i);
//            product.setPrice(77.66f);
//            productMapper.add(product);
//        }
//    }
//
//    @Test
//    public void testTotal() {
//        int total = categoryMapper.total();
//        System.out.println(total);
//    }
//
//    @Test
//    public void testTotalProduct(){
//        int total = productMapper.total();
//    }
//
//    @Test
//    public void testList() {
//        Page p = new Page();
//        p.setStart(2);
//        p.setCount(3);
//        List<Category> cs=categoryMapper.list(p);
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
//    }

}