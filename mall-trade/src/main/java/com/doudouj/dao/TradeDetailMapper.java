package com.doudouj.dao;

import com.doudouj.dto.TradeDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeDetailMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(TradeDetail record);

    int insertSelective(TradeDetail record);

    TradeDetail selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(TradeDetail record);

    int updateByPrimaryKey(TradeDetail record);
}