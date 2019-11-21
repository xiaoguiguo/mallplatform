package com.doudouj.merchandise.dao;

import com.doudouj.merchandise.model.MerchandiseComment;

public interface MerchandiseCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseComment record);

    int insertSelective(MerchandiseComment record);

    MerchandiseComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseComment record);

    int updateByPrimaryKeyWithBLOBs(MerchandiseComment record);

    int updateByPrimaryKey(MerchandiseComment record);
}