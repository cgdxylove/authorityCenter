package com.example.authorityCenter.service.remote.feign;

import com.example.authorityCenter.common.beans.WebResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描述:
 * Feign接口调用测试
 *
 * @author Lenovo
 * @create 2019-04-01 17:00
 */
@FeignClient(value = "message")
public interface FeignTest {

    @RequestMapping(value = "/testMysql", method = RequestMethod.GET)
    WebResponse test();


   /* *//**
     * 异常熔断处理类
     *//*
    @Component
    @Log4j
    class HystrixFallBack implements FeignTest{
        @Override
        public WebResponse test() {
            log.error("===================error=================");
            return null;
        }
    }
    */


}