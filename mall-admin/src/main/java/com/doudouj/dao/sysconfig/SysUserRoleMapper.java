package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.SysUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}