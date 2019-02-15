package com.logmei.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:56 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/consumer/order")
public class ConsumerOrderController {

    private static final String SERVER_IP ="localhost:8701";
    private static final String SERVER_INSTANCE_NAME = "eureka-provider";//找不到服务名

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get/{id}")
    public String getOrder(@PathVariable int id){
        return restTemplate.getForObject("http://"+SERVER_INSTANCE_NAME+"/provider/order/get/"+id,String.class);
    }

    @RequestMapping("/get/list")
    public List getList(){
        return restTemplate.getForObject("http://"+SERVER_IP+"/provider/order/get/list", List.class);
    }
}
