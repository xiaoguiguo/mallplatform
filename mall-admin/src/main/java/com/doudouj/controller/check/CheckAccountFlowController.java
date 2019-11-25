package com.doudouj.controller.check;

import com.doudouj.dto.check.CheckAccountFlow;
import com.doudouj.service.check.CheckAccountFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: CheckAccountFlowController
 * @Author: doudou
 * @Datetime: 2019/11/25-16:37
 * @Description: 账户流水对账
 */
@RestController
@RequestMapping("/checkAccountFlow")
public class CheckAccountFlowController {

    @Autowired
    private CheckAccountFlowService checkAccountFlowService;

    @RequestMapping("/findById")
    public CheckAccountFlow findById(Long id) {
        CheckAccountFlow checkAccountFlow = checkAccountFlowService.findById(id);
        return checkAccountFlow;
    }
}
