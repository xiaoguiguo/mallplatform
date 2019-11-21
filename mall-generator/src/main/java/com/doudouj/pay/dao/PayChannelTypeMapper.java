package com.doudouj.pay.dao;

import com.doudouj.pay.model.PayChannelType;

public interface PayChannelTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayChannelType record);

    int insertSelective(PayChannelType record);

    PayChannelType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayChannelType record);

    int updateByPrimaryKey(PayChannelType record);
}