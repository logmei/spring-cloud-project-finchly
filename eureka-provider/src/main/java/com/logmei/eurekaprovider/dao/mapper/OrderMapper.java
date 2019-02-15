package com.logmei.eurekaprovider.dao.mapper;

import com.logmei.eurekaservicecommon.DataObject.TOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:27 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
@Component
public interface OrderMapper {

    @Insert("insert into t_order (name,price,db_source) values( #{name},#{price},#{dbSource})")
    public int insertOrder(TOrder order);
    @Select("select * from t_order where id=#{id}")
    public TOrder findById(int id);
    @Select("select * from t_order")
    public List<TOrder> findAll();
}
