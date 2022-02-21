package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    @Bean  //Bean的名字就是方法名simpleDateFormat
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    }
}
