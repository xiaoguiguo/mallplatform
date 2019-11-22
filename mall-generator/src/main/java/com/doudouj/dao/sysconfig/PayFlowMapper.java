package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.PayFlow;

public interface PayFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayFlow record);

    int insertSelective(PayFlow record);

    PayFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayFlow record);

    int updateByPrimaryKey(PayFlow record);
}