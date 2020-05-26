package com.sjtu.learningspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {

   /* @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/



    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        return "success";
    }



}
