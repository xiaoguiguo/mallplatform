package com.doudouj.merchandise.dao;

import com.doudouj.merchandise.model.Merchandise;
import com.doudouj.merchandise.model.MerchandiseWithBLOBs;

public interface MerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseWithBLOBs record);

    int insertSelective(MerchandiseWithBLOBs record);

    MerchandiseWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MerchandiseWithBLOBs record);

    int updateByPrimaryKey(Merchandise record);
}