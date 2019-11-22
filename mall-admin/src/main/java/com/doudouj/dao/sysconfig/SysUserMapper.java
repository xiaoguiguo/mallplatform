package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}