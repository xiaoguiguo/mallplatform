package com.doudouj.dao.check;

import com.doudouj.dto.check.CheckPayFlow;

public interface CheckPayFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckPayFlow record);

    int insertSelective(CheckPayFlow record);

    CheckPayFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckPayFlow record);

    int updateByPrimaryKey(CheckPayFlow record);
}