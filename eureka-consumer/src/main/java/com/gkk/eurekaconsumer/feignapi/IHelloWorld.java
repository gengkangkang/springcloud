package com.gkk.eurekaconsumer.feignapi;

import com.gkk.eurekaconsumer.hystrix.HelloWorldFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:gkk
 * @Remark
 * @Date: Created in 2017/12/11 17:04
 */
//@FeignClient("eureka-provider")
@FeignClient(name = "eureka-provider",fallback =HelloWorldFallback.class)
public interface IHelloWorld {
    @RequestMapping("/hello")
    String hello();
}
