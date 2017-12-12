package com.gkk.eurekaconsumer.hystrix;

import com.gkk.eurekaconsumer.feignapi.IHelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author:gkk
 * @Remark 服务降级处理
 * @Date: Created in 2017/12/12 9:58
 */
@Component
public class HelloWorldFallback implements IHelloWorld {

    Logger logger= LoggerFactory.getLogger(getClass());

    @Override
    public String hello() {
        logger.info("服务端调用异常，走服务降级处理！");
        return "hello fallback!";
    }
}
