package com.edu.mall.mobile.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ResponseUtils {

    // 常量
    public static final int SUCCESS = 0;

    /**
     * 成功相应结果
     * @param data 相应的核心数据
     * @return
     */
    public static Object ok(Object data) {
        Map<String,Object> result = new HashMap<>();
        result.put("errrno",SUCCESS);
        result.put("errmsg","成功");
        result.put("data", data);
        return result;
    }

    /**
     * 失败相应结果
     * @param errno  相应的错误码
     * @param errmsg 相应的错误信息
     * @param data   相应的核心数据
     * @return
     */
    public static Object fail(int errno,String errmsg,Object data) {
        Map<String,Object> result = new HashMap<>();
        result.put("errno",errno);
        result.put("errmsg",errmsg);
        result.put("data",data);
        return  result;
    }
}
