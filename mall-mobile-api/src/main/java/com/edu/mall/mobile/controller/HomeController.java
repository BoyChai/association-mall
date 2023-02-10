package com.edu.mall.mobile.controller;

import com.edu.mall.mobile.utils.ResponseUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {
    @RequestMapping("/index")
    public Object index() {
        return ResponseUtils.ok("首页所有数据");
    }
}
