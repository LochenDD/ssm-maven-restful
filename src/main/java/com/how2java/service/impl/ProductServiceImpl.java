package com.how2java.service.impl;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 14:07
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public void add(Product product) {
        productMapper.add(product);
    }

    @Override
    public void delete(int id) {
        productMapper.delete(id);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public int total() {
        return productMapper.total();
    }

    @Override
    public Product get(int id) {
        return productMapper.get(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.list();
    }

    @Override
    public List<Product> list(Page page) {
        return productMapper.list(page);
    }
}
