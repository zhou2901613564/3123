package com.zx.message.com.zx.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
//    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        System.out.println("test");
    }

//    @ResponseBody
    @RequestMapping("/msg")
    public String getMsg(){

        return  "";
    }

}
