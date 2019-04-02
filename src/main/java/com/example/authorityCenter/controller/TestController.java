package com.example.authorityCenter.controller;

import com.example.authorityCenter.common.beans.WebResponse;
import com.example.authorityCenter.service.remote.TestService;
import com.example.authorityCenter.service.remote.feign.FeignTest;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cg
 * @create 2019-03-26 17:33
 */
@RestController
@Log4j
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    FeignTest feignTest ;

    @RequestMapping(value = "/test")
    public WebResponse testRemote(){
        WebResponse webResponse = testService.getMember();
        return webResponse;
    }

    @RequestMapping(value = "/feignTest")
    public WebResponse feignTest() {
        WebResponse webResponse = feignTest.test();
        return webResponse;
    }

}