package com.jc.spring_cloud_parent.ribbon_server.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Ling
 * @Description
 * @DATE 12/9/2019 16:55
 **/
@Service
public class RibbonService{
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD",String.class);
    }
    public String hiService2() {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/hi",String.class);
    }
    public String hiError() {
        return "hi,sorry,error!";
    }
}
