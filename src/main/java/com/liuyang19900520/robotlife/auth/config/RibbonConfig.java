package com.liuyang19900520.robotlife.auth.config;


import com.liuyang19900520.robotlife.auth.annotation.ExcludeFromComponentScan;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: robotlife-user-java
 * @description:
 * @author: LiuYang
 * @create: 2018-08-13 16:05
 **/
@Configuration
@ExcludeFromComponentScan
public class RibbonConfig {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
