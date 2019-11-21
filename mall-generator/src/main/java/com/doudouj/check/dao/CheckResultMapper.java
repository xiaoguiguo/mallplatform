package com.doudouj.check.dao;

import com.doudouj.check.model.CheckResult;

public interface CheckResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckResult record);

    int insertSelective(CheckResult record);

    CheckResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckResult record);

    int updateByPrimaryKey(CheckResult record);
}