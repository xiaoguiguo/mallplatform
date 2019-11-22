package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.SysDataDict;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDataDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDataDict record);

    int insertSelective(SysDataDict record);

    SysDataDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDataDict record);

    int updateByPrimaryKey(SysDataDict record);
}