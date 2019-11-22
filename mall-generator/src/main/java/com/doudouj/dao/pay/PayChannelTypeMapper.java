package com.doudouj.dao.pay;

import com.doudouj.dto.pay.PayChannelType;

public interface PayChannelTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayChannelType record);

    int insertSelective(PayChannelType record);

    PayChannelType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayChannelType record);

    int updateByPrimaryKey(PayChannelType record);
}