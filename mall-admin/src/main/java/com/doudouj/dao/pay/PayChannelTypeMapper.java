package com.doudouj.dao.pay;

import com.doudouj.dto.pay.PayChannelType;
import org.springframework.stereotype.Repository;

@Repository
public interface PayChannelTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayChannelType record);

    int insertSelective(PayChannelType record);

    PayChannelType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayChannelType record);

    int updateByPrimaryKey(PayChannelType record);
}