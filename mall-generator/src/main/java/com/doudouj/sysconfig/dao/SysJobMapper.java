package com.doudouj.sysconfig.dao;

import com.doudouj.sysconfig.model.SysJob;

public interface SysJobMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    SysJob selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}