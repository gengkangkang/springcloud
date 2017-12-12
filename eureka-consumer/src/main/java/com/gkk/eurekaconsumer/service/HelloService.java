package com.gkk.eurekaconsumer.service;

import com.gkk.eurekaconsumer.feignapi.IHelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:gkk
 * @Remark
 * @Date: Created in 2017/12/11 17:09
 */
@RestController
public class HelloService {
    Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
   private IHelloWorld iHelloWorld;

    @RequestMapping("/home")
    public String hellotest(){
       logger.info("通过feign调用服务端");
       return iHelloWorld.hello();
    }
}
