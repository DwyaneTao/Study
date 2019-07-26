package com.hu.config;


import com.hu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 这是一个配置类
 */
@Configuration
@ComponentScan(value="com.hu.bean")
public class MainConfig {

    //给容器中注册一个Bean  类型为返回值类型，id默认是方法名作为id
    @Bean
    public Person person(){
        return new Person("李四",20);
    }



}
