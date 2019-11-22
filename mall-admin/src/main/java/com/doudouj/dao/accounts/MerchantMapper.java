package com.doudouj.dao.accounts;

import com.doudouj.dto.accounts.Merchant;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}