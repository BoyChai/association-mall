package com.edu.mall.mobile.controller;

import com.edu.mall.mobile.utils.ResponseUtils;
import org.example.mapper.LitemallAdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    //注入LitemallAdMapper
    @Autowired
    private LitemallAdMapper litemallAdMapper;

    @RequestMapping("/index")
    public Object index() {
        // 执行sql语句
        Object data = litemallAdMapper.selectAdList();
        return ResponseUtils.ok(data);
    }
}
