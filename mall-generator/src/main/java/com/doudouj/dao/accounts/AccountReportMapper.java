package com.doudouj.dao.accounts;

import com.doudouj.dto.accounts.AccountReport;

public interface AccountReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccountReport record);

    int insertSelective(AccountReport record);

    AccountReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountReport record);

    int updateByPrimaryKeyWithBLOBs(AccountReport record);

    int updateByPrimaryKey(AccountReport record);
}