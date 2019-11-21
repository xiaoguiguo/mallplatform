package com.doudouj.pay.dao;

import com.doudouj.pay.model.Merchandise;

public interface MerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    Merchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);
}