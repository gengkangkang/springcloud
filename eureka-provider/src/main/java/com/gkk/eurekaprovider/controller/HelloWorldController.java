package com.gkk.eurekaprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:gkk
 * @Remark
 * @Date: Created in 2017/12/11 16:22
 */
@RestController
public class HelloWorldController {
     public static Logger logger= LoggerFactory.getLogger(HelloWorldController.class);

     @RequestMapping("/hello")
    public String hello() throws InterruptedException {
        logger.info("---------------hello world!-------------------------");
        Thread.sleep(5000);
        return "hello world！";
    }

}
