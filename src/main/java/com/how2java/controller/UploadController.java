package com.how2java.controller;

import com.how2java.pojo.UploadImageFile;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/4 13:54
 */
@Controller
@RequestMapping("/")
public class UploadController {

    @RequestMapping("uploadImage")
    public ModelAndView upload(HttpServletRequest req, UploadImageFile file) throws IOException {
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name + ".jpg";
        File newFile = new File(req.getServletContext().getRealPath("/image"), newFileName);
        boolean flag = newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);
        ModelAndView mav = new ModelAndView("showImage");
        mav.addObject("imageName", newFileName);
        return mav;
    }
}
