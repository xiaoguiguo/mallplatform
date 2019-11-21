package com.doudouj.trade.dao;

import com.doudouj.trade.model.TradeItem;

public interface TradeItemMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(TradeItem record);

    int insertSelective(TradeItem record);

    TradeItem selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(TradeItem record);

    int updateByPrimaryKey(TradeItem record);
}