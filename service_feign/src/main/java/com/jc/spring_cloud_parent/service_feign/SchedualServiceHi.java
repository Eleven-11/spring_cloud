package com.jc.spring_cloud_parent.service_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Lingling00
 * @Description
 * @DATE 12/11/2019 10:56
 **/
@FeignClient(value = "SERVICE-HELLOWORLD")
public interface SchedualServiceHi {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHiFromClientOne();
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayFuckFromClientOne();
}
