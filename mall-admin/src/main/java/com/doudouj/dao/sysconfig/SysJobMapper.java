package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.SysJob;
import org.springframework.stereotype.Repository;

@Repository
public interface SysJobMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    SysJob selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}