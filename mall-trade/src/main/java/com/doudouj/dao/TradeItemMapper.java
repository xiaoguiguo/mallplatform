package com.doudouj.dao;

import com.doudouj.dto.TradeItem;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeItemMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(TradeItem record);

    int insertSelective(TradeItem record);

    TradeItem selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(TradeItem record);

    int updateByPrimaryKey(TradeItem record);
}