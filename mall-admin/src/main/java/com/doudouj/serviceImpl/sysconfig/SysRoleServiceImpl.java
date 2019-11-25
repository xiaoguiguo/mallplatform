package com.doudouj.serviceImpl.sysconfig;

import com.doudouj.dao.sysconfig.SysRoleMapper;
import com.doudouj.dto.sysconfig.SysRole;
import com.doudouj.service.sysconfig.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: SysRoleServiceImpl
 * @Author: doudou
 * @Datetime: 2019/11/25-9:38
 * @Description: 系统角色api实现类
 */
@Service
@Slf4j
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysRole findById(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }
}
