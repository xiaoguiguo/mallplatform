package com.doudouj.serviceImpl.accounts;

import com.doudouj.dao.accounts.AccountInfoMapper;
import com.doudouj.dto.accounts.AccountInfo;
import com.doudouj.service.accounts.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AccountInfoServiceImpl
 * @Author: doudou
 * @Datetime: 2019/11/22-14:16
 * @Description: 账户信息服务实现类
 */
@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountInfoMapper accountInfoMapper;

    @Override
    public List<AccountInfo> listAll() {
        return accountInfoMapper.listAll();
    }

    @Override
    public AccountInfo findById(long id) {
        return accountInfoMapper.selectByPrimaryKey(id);
    }
}
