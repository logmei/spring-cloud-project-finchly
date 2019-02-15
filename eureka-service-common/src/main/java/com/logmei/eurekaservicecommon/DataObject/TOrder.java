package com.logmei.eurekaservicecommon.DataObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:15 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TOrder {
    private int id;
    private String name;
    private Double price;
    private String dbSource;
}
