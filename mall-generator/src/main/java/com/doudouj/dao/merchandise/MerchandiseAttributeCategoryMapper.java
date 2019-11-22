package com.doudouj.dao.merchandise;

import com.doudouj.dto.merchandise.MerchandiseAttributeCategory;

public interface MerchandiseAttributeCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseAttributeCategory record);

    int insertSelective(MerchandiseAttributeCategory record);

    MerchandiseAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseAttributeCategory record);

    int updateByPrimaryKey(MerchandiseAttributeCategory record);
}