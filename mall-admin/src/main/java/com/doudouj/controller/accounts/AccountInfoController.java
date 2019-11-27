package com.doudouj.controller.accounts;

import com.doudouj.dto.accounts.AccountInfo;
import com.doudouj.service.accounts.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: AccountInfoController
 * @Author: doudou
 * @Datetime: 2019/11/22-14:02
 * @Description: 账户信息
 */
@RestController
@RequestMapping("/accountInfo")
public class AccountInfoController {

    @Autowired
    private AccountInfoService accountInfoService;

    @RequestMapping("/query")
    public List<AccountInfo> accountInfoQuery() {
        return accountInfoService.listAll();
    }

    @RequestMapping("/findById")
    public AccountInfo findById(long id) {
        return accountInfoService.findById(id);
    }
}
