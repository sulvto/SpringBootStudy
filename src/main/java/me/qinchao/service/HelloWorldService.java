package me.qinchao.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-6-14.
 */
@Component
public class HelloWorldService {

    public String getHelloMessage(String name) {
        return "Hello " + name;
    }
}
