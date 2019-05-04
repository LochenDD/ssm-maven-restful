package com.how2java.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/4 13:52
 */
public class UploadImageFile {
    private MultipartFile image;

    public MultipartFile getImage(){
        return image;
    }

    public void setImage(MultipartFile image){
        this.image = image;
    }
}
