package com.doudouj.service.accounts;

import com.doudouj.dto.accounts.AccountInfo;

import java.util.List;

/**
 * @ClassName: AccountInfoService
 * @Author: doudou
 * @Datetime: 2019/11/22-14:11
 * @Description: 账户信息接口
 */
public interface AccountInfoService {
    List<AccountInfo> listAll();

    AccountInfo findById(long id);
}
