package com.logmei.eurekaconsumer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：logmei.
 * @ Date       ：Created in 14:55 2019/2/15
 * @ Description：
 * @ Modified By：
 * @Version: 1.0.0
 */
@Configuration
public class RestTemplateClient {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
