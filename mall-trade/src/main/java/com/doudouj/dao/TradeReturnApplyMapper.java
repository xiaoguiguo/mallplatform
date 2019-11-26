package com.doudouj.dao;

import com.doudouj.dto.TradeReturnApply;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeReturnApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeReturnApply record);

    int insertSelective(TradeReturnApply record);

    TradeReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeReturnApply record);

    int updateByPrimaryKey(TradeReturnApply record);
}