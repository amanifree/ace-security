package com.github.wxiaoqi.security.sale;

import com.ace.cache.EnableAceCache;
import com.github.wxiaoqi.security.auth.client.EnableAceAuthClient;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-05-25 12:44
 */
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients({"com.github.wxiaoqi.security.auth.client.feign"})
@EnableScheduling
@EnableAceAuthClient
@EnableAceCache
@EnableTransactionManagement
@MapperScan("com.github.wxiaoqi.security.sale.mapper")
@EnableSwagger2Doc
public class SaleBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SaleBootstrap.class).web(true).run(args);    }
}
