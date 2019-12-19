package com.jc.spring_cloud_parent.eureka_client.controller;

import com.jc.spring_cloud_parent.eureka_client.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ling
 * @Description
 * @DATE 12/9/2019 16:57
 **/
@RestController
public class HelloController {

    @Autowired
    RibbonService ribbonService;
    @RequestMapping(value = "/hi")
    public String hi(){
        return ribbonService.hiService();
    }


}
