package com.logmei.eurekaprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 9:05 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
@SpringBootApplication
//mybatis注解需要增加扫描
@MapperScan(basePackages = "com.logmei.eurekaprovider.dao.mapper")
//@EnableDiscoverClient 和 @EnableEurekaClient 从Edgware开始该注解可省略
public class EurekaproviderApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaproviderApplication.class,args);
    }
}
