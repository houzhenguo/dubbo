package com.houzhenguo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.houzhenguo.service.IUserSerivce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private IUserSerivce userSerivce;
    @RequestMapping("/sayhello")
    public String sayHello(@RequestParam("name") String name) {
        return userSerivce.sayHello(name);
    }
}
