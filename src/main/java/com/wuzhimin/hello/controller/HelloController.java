package com.wuzhimin.hello.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by 风影
 * 2018/2/3 13:31
 */
@RestController
public class HelloController{

    private final Logger logger = Logger.getLogger(getClass());

    @PostMapping("/user")
    public Object postUser(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("method","post user");
        return map;
    }

    @GetMapping("/user/{id}")
    public Object getUser(@PathVariable String id){
        logger.info("id = "+id);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("method","get user");
        return map;
    }

    @PutMapping("/user/{id}")
    public Object updateUser(@PathVariable String id){
        logger.info("id = "+id);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("method","update user");
        return map;
    }

    @DeleteMapping("/user/{id}")
    public Object deleteUser(@PathVariable String id){
        logger.info("id = "+id);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("method","delete user");
        return map;
    }
}
