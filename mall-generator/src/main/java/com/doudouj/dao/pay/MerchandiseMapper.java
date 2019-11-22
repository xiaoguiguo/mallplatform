package com.doudouj.dao.pay;

import com.doudouj.dto.pay.Merchandise;

public interface MerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    Merchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);
}