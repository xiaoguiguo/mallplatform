package com.doudouj.dao.check;

import com.doudouj.dto.check.CheckResult;

public interface CheckResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckResult record);

    int insertSelective(CheckResult record);

    CheckResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckResult record);

    int updateByPrimaryKey(CheckResult record);
}