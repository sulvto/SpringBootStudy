package me.qinchao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-5-18.
 */
@Component
public class AsyncWorker {
    private final Logger logger = LoggerFactory.getLogger(AsyncWorker.class);

    @Async
    void work() {
        String threadName = Thread.currentThread().getName();
        logger.info(threadName + " ： AsyncWorker ");
    }
}