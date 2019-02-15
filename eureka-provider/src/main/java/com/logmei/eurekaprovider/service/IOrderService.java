package com.logmei.eurekaprovider.service;

import com.logmei.eurekaservicecommon.DataObject.TOrder;

import java.util.List;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:34 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
public interface IOrderService {

    TOrder findById(int id);

    List<TOrder> findAll();
}
