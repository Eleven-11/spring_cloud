package com.jc.spring_cloud_parent.eureka_client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Ling
 * @Description
 * @DATE 12/9/2019 16:55
 **/
@Service
public class RibbonService{
//    @Autowired
//    RestTemplate restTemplate;
    @Value("${server.port}")
    String port;
    public String hiService() {
        return "fucking ribbon from "+ port;
    }
}
