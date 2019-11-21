package com.doudouj.check.dao;

import com.doudouj.check.model.CheckTradeFlow;

public interface CheckTradeFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckTradeFlow record);

    int insertSelective(CheckTradeFlow record);

    CheckTradeFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckTradeFlow record);

    int updateByPrimaryKey(CheckTradeFlow record);
}