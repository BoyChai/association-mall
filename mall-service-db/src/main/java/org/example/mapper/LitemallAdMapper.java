package org.example.mapper;

import org.example.po.LitemallAd;

import java.util.List;

public interface LitemallAdMapper {

    /**
     * 查询广告信息列表
     */
    List<LitemallAd> selectAdList();

}
