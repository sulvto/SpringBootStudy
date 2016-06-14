package me.qinchao.service;

import me.qinchao.SpringBootStudyApplicationTests;
import me.qinchao.aop.ServiceMonitor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-6-14.
 */
public class HelloWorldServiceTest extends SpringBootStudyApplicationTests {

    private final static Logger LOGGER = LoggerFactory.getLogger(ServiceMonitor.class);

    @Autowired
    private HelloWorldService helloWorldService;
    @Test
    public void getHelloMessage() throws Exception {
        String message = helloWorldService.getHelloMessage("zhangsan");
        LOGGER.info(message);
    }

}