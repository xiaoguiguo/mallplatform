package com.doudouj.dao;

import com.doudouj.dto.CheckAccountFlow;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckAccountFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckAccountFlow record);

    int insertSelective(CheckAccountFlow record);

    CheckAccountFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckAccountFlow record);

    int updateByPrimaryKey(CheckAccountFlow record);
}