package com.doudouj.merchandise.dao;

import com.doudouj.merchandise.model.MerchandiseAttributeValue;

public interface MerchandiseAttributeValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseAttributeValue record);

    int insertSelective(MerchandiseAttributeValue record);

    MerchandiseAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseAttributeValue record);

    int updateByPrimaryKey(MerchandiseAttributeValue record);
}