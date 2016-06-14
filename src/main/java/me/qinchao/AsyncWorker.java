package me.qinchao;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-5-18.
 */
@Component
public class AsyncWorker {

    @Async
    void work() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " ： AsyncWorker ");
    }
}