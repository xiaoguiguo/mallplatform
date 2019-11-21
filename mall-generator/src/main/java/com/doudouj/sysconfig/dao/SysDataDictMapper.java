package com.doudouj.sysconfig.dao;

import com.doudouj.sysconfig.model.SysDataDict;

public interface SysDataDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDataDict record);

    int insertSelective(SysDataDict record);

    SysDataDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDataDict record);

    int updateByPrimaryKey(SysDataDict record);
}