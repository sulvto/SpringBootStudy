package me.qinchao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-5-18.
 */
@Component
public class ScheduledHandler {

    @Autowired
    private AsyncWorker asyncWorker;

    @Scheduled(cron = "0/5 * * * * ?")
    public void run() {

        System.out.println("Scheduled cron = 0/5 * * * * ?");
        asyncWorker.work();
    }
}

