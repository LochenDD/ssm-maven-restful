package com.how2java.controller;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 14:08
 */
@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("listProduct")
    public ModelAndView list(Page page){
        System.out.println(page);
        ModelAndView mav = new ModelAndView();
        List<Product> ps = productService.list(page);
        int total = productService.total();
        mav.addObject("ps",ps);
//        page.calculateLast(total);
        mav.setViewName("listProduct");
        return mav;
    }
}
