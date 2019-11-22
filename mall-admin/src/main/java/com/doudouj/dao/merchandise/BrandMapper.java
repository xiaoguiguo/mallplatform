package com.doudouj.dao.merchandise;

import com.doudouj.dto.merchandise.Brand;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKeyWithBLOBs(Brand record);

    int updateByPrimaryKey(Brand record);
}