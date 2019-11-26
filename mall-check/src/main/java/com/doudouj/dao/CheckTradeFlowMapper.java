package com.doudouj.dao;

import com.doudouj.dto.CheckTradeFlow;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckTradeFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckTradeFlow record);

    int insertSelective(CheckTradeFlow record);

    CheckTradeFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckTradeFlow record);

    int updateByPrimaryKey(CheckTradeFlow record);
}