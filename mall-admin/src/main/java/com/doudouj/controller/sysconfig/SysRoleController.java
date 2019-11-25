package com.doudouj.controller.sysconfig;

import com.doudouj.dto.sysconfig.SysRole;
import com.doudouj.service.sysconfig.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: SysRoleController
 * @Author: doudou
 * @Datetime: 2019/11/25-9:35
 * @Description: 系统角色
 */
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/findById")
    public SysRole findById(Long id) {
        SysRole role = sysRoleService.findById(id);
        return role;
    }
}
