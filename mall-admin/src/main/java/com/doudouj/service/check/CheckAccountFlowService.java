package com.doudouj.service.check;

import com.doudouj.dto.check.CheckAccountFlow;

/**
 * @ClassName: CheckAccountFlowService
 * @Author: doudou
 * @Datetime: 2019/11/25-16:41
 * @Description: 账户流水对账接口
 */
public interface CheckAccountFlowService {

    CheckAccountFlow findById(Long id);
}
