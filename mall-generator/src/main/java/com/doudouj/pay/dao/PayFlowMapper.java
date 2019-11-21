package com.doudouj.pay.dao;

import com.doudouj.pay.model.PayFlow;

public interface PayFlowMapper {
    int deleteByPrimaryKey(Long payId);

    int insert(PayFlow record);

    int insertSelective(PayFlow record);

    PayFlow selectByPrimaryKey(Long payId);

    int updateByPrimaryKeySelective(PayFlow record);

    int updateByPrimaryKey(PayFlow record);
}