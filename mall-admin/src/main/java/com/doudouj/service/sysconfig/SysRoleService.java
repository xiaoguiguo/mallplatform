package com.doudouj.service.sysconfig;

import com.doudouj.dto.sysconfig.SysRole;

/**
 * @ClassName: SysRoleService
 * @Author: doudou
 * @Datetime: 2019/11/25-9:37
 * @Description: 系统角色api
 */
public interface SysRoleService {
    SysRole findById(Long id);
}
