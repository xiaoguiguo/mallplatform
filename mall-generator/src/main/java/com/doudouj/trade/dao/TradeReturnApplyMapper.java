package com.doudouj.trade.dao;

import com.doudouj.trade.model.TradeReturnApply;

public interface TradeReturnApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeReturnApply record);

    int insertSelective(TradeReturnApply record);

    TradeReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeReturnApply record);

    int updateByPrimaryKey(TradeReturnApply record);
}