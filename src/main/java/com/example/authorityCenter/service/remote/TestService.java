package com.example.authorityCenter.service.remote;


import com.example.authorityCenter.common.beans.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author cg
 * @create 2019-03-26 17:28
 */
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;

    public WebResponse getMember(){
        return restTemplate.getForObject("http://message/message/testMysql",WebResponse.class);
    }


}