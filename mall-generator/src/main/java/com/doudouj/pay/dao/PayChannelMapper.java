package com.doudouj.pay.dao;

import com.doudouj.pay.model.PayChannel;

public interface PayChannelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    PayChannel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}