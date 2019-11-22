package com.doudouj.dao.merchandise;

import com.doudouj.dto.merchandise.Merchandise;
import com.doudouj.dto.merchandise.MerchandiseWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseWithBLOBs record);

    int insertSelective(MerchandiseWithBLOBs record);

    MerchandiseWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MerchandiseWithBLOBs record);

    int updateByPrimaryKey(Merchandise record);
}