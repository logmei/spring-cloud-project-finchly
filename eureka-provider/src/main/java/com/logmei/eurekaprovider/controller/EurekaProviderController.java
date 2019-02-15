package com.logmei.eurekaprovider.controller;

import com.logmei.eurekaprovider.service.IOrderService;
import com.logmei.eurekaservicecommon.DataObject.TOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:37 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/provider/order")
@Slf4j
public class EurekaProviderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/get/{id}")
    public TOrder getOrder(@PathVariable int id){
        return orderService.findById(id);
    }

    @RequestMapping("/get/list")
    public List<TOrder> getList(){
        return orderService.findAll();
    }
}
