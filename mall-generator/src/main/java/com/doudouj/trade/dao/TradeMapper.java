package com.doudouj.trade.dao;

import com.doudouj.trade.model.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}