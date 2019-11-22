package com.doudouj.dao.accounts;

import com.doudouj.dto.accounts.AccountInfo;

public interface AccountInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    AccountInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);
}