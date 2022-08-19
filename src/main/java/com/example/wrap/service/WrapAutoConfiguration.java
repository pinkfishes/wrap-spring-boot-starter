package com.example.wrap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: qinhy
 * @createDate: 2022/8/19 上午12:05
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties(WrapProperties.class)
@ConditionalOnClass(WrapService.class)
public class WrapAutoConfiguration {

    @Autowired
    private WrapProperties wrapProperties;

    @Bean
    @ConditionalOnMissingBean
    public WrapService wrapService(){
        return new WrapService(wrapProperties.getPrefix(), wrapProperties.getSuffix());
    }

}
