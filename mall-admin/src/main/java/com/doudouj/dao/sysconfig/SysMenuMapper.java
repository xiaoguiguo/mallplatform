package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}