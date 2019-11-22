package com.doudouj.dao.merchandise;

import com.doudouj.dto.merchandise.MerchandiseAttributeValue;

public interface MerchandiseAttributeValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseAttributeValue record);

    int insertSelective(MerchandiseAttributeValue record);

    MerchandiseAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseAttributeValue record);

    int updateByPrimaryKey(MerchandiseAttributeValue record);
}