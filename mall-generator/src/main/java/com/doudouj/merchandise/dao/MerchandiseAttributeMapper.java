package com.doudouj.merchandise.dao;

import com.doudouj.merchandise.model.MerchandiseAttribute;

public interface MerchandiseAttributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseAttribute record);

    int insertSelective(MerchandiseAttribute record);

    MerchandiseAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseAttribute record);

    int updateByPrimaryKey(MerchandiseAttribute record);
}