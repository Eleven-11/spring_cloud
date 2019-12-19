package com.jc.spring_cloud_parent.ribbon_server.controller;

import com.jc.spring_cloud_parent.ribbon_server.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping(value = "/")
    public String hi(){
        return ribbonService.hiService();
    }
    @RequestMapping(value = "/hello")
    public String hi2(){
        return ribbonService.hiService2();
    }


}
