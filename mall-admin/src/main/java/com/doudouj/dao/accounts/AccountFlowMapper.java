package com.doudouj.dao.accounts;

import com.doudouj.dto.accounts.AccountFlow;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccountFlow record);

    int insertSelective(AccountFlow record);

    AccountFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountFlow record);

    int updateByPrimaryKey(AccountFlow record);
}