package com.jc.spring_cloud_parent.service_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ling
 * @Description
 * @DATE 12/11/2019 11:17
 **/
@RestController
public class HiController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/")
    public String sayHi() {
        return schedualServiceHi.sayHiFromClientOne();
    }
    @GetMapping(value = "/hello")
    public String sayFuck() {
        return schedualServiceHi.sayFuckFromClientOne();
    }
}

