package com.doudouj.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AccountsDatabaseProperties
 * @Author: doudou
 * @Datetime: 2019/11/25-15:41
 * @Description: accounts库配置
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource.pay")
@Data
public class PayDatabaseProperties {
    private String url;
    private String username;
    private String password;
    private String type;
    private String driver;
}
