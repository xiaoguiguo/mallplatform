package com.doudouj.dao.check;

import com.doudouj.dto.check.CheckPayFlow;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckPayFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckPayFlow record);

    int insertSelective(CheckPayFlow record);

    CheckPayFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckPayFlow record);

    int updateByPrimaryKey(CheckPayFlow record);
}