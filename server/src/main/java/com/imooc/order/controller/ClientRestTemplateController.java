package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zxlei
 * @date 2019/8/22 10:34
 * ----------------------------------------------
 * 服务间通信
 * ----------------------------------------------
 */
@RestController
@Slf4j
public class ClientRestTemplateController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplateAuto;


    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        //第一种方式(直接使用restTemplate,url写死)
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);
        log.info("response = {}", response);

        //第二种方式(利用loadBalancerClient通过应用名获取url，然后再使用restTemplate)
        ServiceInstance instance = loadBalancerClient.choose("PRODUCT");
        instance.getHost();
        String url = String.format("http://%s:%s", instance.getHost(), instance.getPort() + "/msg");
        String response2 = restTemplate.getForObject(url, String.class);
        log.info("respnose2 = {}", response2);

        //第三种方式(利用@LoadBalanced,可在restTemplate里面使用应用名字)
        String response3 = restTemplateAuto.getForObject("http://PRODUCT/msg", String.class);
        log.info("respnose3 = {}", response3);

        return response;
    }


}
