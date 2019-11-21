package com.doudouj.merchandise.dao;

import com.doudouj.merchandise.model.MerchandiseAttributeCategory;

public interface MerchandiseAttributeCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseAttributeCategory record);

    int insertSelective(MerchandiseAttributeCategory record);

    MerchandiseAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseAttributeCategory record);

    int updateByPrimaryKey(MerchandiseAttributeCategory record);
}