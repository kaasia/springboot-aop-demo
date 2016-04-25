package com.kfly.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Kfly on 2016/4/20.
 */
@Component
public class HelloWorldService {
    @Value("${name:World}")
    private String name;

    public String getHelloMessage(){
        return "hello "+this.name;
    }
}
