package com.edu.mall.mobile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //标注当前类是一个Controller控制器组件(开发Api接口的)
public class HelloController {
    // 每个方法一个api接口

    @RequestMapping("/hello") // 标注当前方法是一个请求处理方法(参数是路径/返回值就是接口的响应结果)
    public Object hello() {
        return "Hello,SpringBoot";
    }
}
