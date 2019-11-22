package com.doudouj.dao.pay;

import com.doudouj.dto.pay.PayFlow;
import org.springframework.stereotype.Repository;

@Repository
public interface PayFlowMapper {
    int deleteByPrimaryKey(Long payId);

    int insert(PayFlow record);

    int insertSelective(PayFlow record);

    PayFlow selectByPrimaryKey(Long payId);

    int updateByPrimaryKeySelective(PayFlow record);

    int updateByPrimaryKey(PayFlow record);
}