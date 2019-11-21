package com.doudouj.account.dao;

import com.doudouj.account.model.AccountReport;

public interface AccountReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccountReport record);

    int insertSelective(AccountReport record);

    AccountReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountReport record);

    int updateByPrimaryKeyWithBLOBs(AccountReport record);

    int updateByPrimaryKey(AccountReport record);
}