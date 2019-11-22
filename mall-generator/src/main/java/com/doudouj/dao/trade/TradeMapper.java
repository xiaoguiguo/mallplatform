package com.doudouj.dao.trade;

import com.doudouj.dto.trade.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}