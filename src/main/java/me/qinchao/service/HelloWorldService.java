package me.qinchao.service;

import me.qinchao.aop.ServiceMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-6-14.
 */
@Component
public class HelloWorldService {
    private final static Logger LOGGER = LoggerFactory.getLogger(ServiceMonitor.class);

    public String getHelloMessage(String name) {
        LOGGER.info("HelloWorldService.getHelloMessage");
        return "Hello " + name;
    }
}
