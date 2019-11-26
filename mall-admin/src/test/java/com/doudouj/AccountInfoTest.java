package com.doudouj;

import com.doudouj.dto.accounts.AccountInfo;
import com.doudouj.service.accounts.AccountInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: AccountInfoTest
 * @Author: doudou
 * @Datetime: 2019/11/26-18:47
 * @Description: 账户信息单元测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountInfoTest {

    @Resource
    private AccountInfoService accountInfoService;

    @Test
    public void findById() {
        AccountInfo accountInfo = accountInfoService.findById(1);
        System.out.println(accountInfo.toString());
    }

}
