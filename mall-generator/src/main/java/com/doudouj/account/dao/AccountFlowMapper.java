package com.doudouj.account.dao;

import com.doudouj.account.model.AccountFlow;

public interface AccountFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccountFlow record);

    int insertSelective(AccountFlow record);

    AccountFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountFlow record);

    int updateByPrimaryKey(AccountFlow record);
}