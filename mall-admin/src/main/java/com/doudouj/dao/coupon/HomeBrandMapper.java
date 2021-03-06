package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.HomeBrand;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeBrand record);

    int insertSelective(HomeBrand record);

    HomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeBrand record);

    int updateByPrimaryKey(HomeBrand record);
}