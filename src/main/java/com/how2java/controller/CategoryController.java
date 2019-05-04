package com.how2java.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 13:51
 */
@Controller
@RequestMapping("/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value="categories", method = RequestMethod.GET)
    public ModelAndView listCategory(Page page) {
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Category> cs = categoryService.list();

        int total = (int) new PageInfo<>(cs).getTotal();
        page.calculateLast(total);

        mav.addObject("cs", cs);
        mav.setViewName("listCategory");
        return mav;
    }

    @RequestMapping(value = "addCategory",method = RequestMethod.POST)
    public ModelAndView addCategory(Category category) {
        categoryService.add(category);
        return new ModelAndView("redirect:listCategory");
    }

    @RequestMapping(value = "deleteCategory",method = RequestMethod.DELETE)
    public ModelAndView deleteCategory(int id) {
        categoryService.delete(id);
        return new ModelAndView("redirect:listCategory");
    }

    @RequestMapping(value = "editCategory",method = RequestMethod.GET)
    public ModelAndView editCategory(Category category) {
        Category c = categoryService.get(category.getId());
        ModelAndView mav = new ModelAndView("editCategory");
        mav.addObject("c", c);
        return mav;
    }

    @RequestMapping(value = "updateCategory",method = RequestMethod.PUT)
    public ModelAndView updateCategory(Category category) {
        categoryService.update(category);
        return new ModelAndView("redirect:listCategory");
    }

    @ResponseBody
    @RequestMapping("submitCategory")
    public String submitCategory(@RequestBody Category category) {
        System.out.println("SSM接受到浏览器提交的json，并转换为Category对象:" + category);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("getOneCategory")
    public String getOneCategory() {
        Category c = new Category();
        c.setId(110);
        c.setName("分类名称:category 110");
        JSONObject json = new JSONObject();
        json.put("category", JSONObject.toJSON(c));
        return json.toJSONString();
    }

    @ResponseBody
    @RequestMapping("getManyCategory")
    public String getManyCategory() {
        List<Category> cs = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Category c = new Category();
            c.setId(i+1);
            c.setName("分类名称:category " + i);
            cs.add(c);
        }
        return JSONObject.toJSON(cs).toString();
    }
}
