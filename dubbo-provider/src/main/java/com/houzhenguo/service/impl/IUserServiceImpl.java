package com.houzhenguo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.houzhenguo.service.IUserSerivce;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IUserSerivce.class)
public class IUserServiceImpl implements IUserSerivce {
    @Override
    public String sayHello(String name) {
        return "hello"+ name;
    }
}
