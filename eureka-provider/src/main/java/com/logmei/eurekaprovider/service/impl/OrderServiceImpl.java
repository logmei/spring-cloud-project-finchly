package com.logmei.eurekaprovider.service.impl;

import com.logmei.eurekaprovider.dao.mapper.OrderMapper;
import com.logmei.eurekaprovider.service.IOrderService;
import com.logmei.eurekaservicecommon.DataObject.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:35 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public TOrder findById(int id) {
        return orderMapper.findById(id);
    }

    @Override
    public List<TOrder> findAll() {
        return orderMapper.findAll();
    }
}
