package com.doudouj.serviceImpl.check;

import com.doudouj.dao.check.CheckAccountFlowMapper;
import com.doudouj.dto.check.CheckAccountFlow;
import com.doudouj.service.check.CheckAccountFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CheckAccountFlowServiceImpl
 * @Author: doudou
 * @Datetime: 2019/11/25-16:41
 * @Description: 账户流水对账实现类
 */
@Service
@Slf4j
public class CheckAccountFlowServiceImpl implements CheckAccountFlowService {

    @Autowired
    private CheckAccountFlowMapper checkAccountFlowMapper;

    @Override
    public CheckAccountFlow findById(Long id) {
        return checkAccountFlowMapper.selectByPrimaryKey(id);
    }
}
