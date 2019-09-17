package com.imooc.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @author zxlei
 * @date 2019/9/2 13:57
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    //超时配置
    //@HystrixCommand(commandProperties = @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000"))


    /**
     * 设置熔断
     *
     * @return
     */
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    //@HystrixCommand
    @GetMapping("/getPrdocuctInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number) {
        if (number % 2 == 0) {
            return "success";
        }

        RestTemplate restTemplate = new RestTemplate();
        String s = restTemplate.postForObject("http://127.0.0.1:7002/product/listForOrder",
                Arrays.asList("157875196366160022"), String.class);
        return s;

//        throw new RuntimeException("发送异常了");

    }

    private String fallback() {
        return "太拥挤了,请稍后再试~~";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了,请稍后再试~~";
    }

}
