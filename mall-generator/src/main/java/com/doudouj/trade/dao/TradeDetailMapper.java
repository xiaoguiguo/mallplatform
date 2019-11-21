package com.doudouj.trade.dao;

import com.doudouj.trade.model.TradeDetail;

public interface TradeDetailMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(TradeDetail record);

    int insertSelective(TradeDetail record);

    TradeDetail selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(TradeDetail record);

    int updateByPrimaryKey(TradeDetail record);
}