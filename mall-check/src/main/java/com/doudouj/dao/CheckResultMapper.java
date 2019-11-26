package com.doudouj.dao;

import com.doudouj.dto.CheckResult;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckResult record);

    int insertSelective(CheckResult record);

    CheckResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckResult record);

    int updateByPrimaryKey(CheckResult record);
}