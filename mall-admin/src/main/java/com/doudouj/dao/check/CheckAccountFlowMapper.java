package com.doudouj.dao.check;

import com.doudouj.dto.check.CheckAccountFlow;
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