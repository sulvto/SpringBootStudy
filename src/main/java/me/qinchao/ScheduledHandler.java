package me.qinchao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by sulvto on 16-5-18.
 */
@Component
public class ScheduledHandler {
    private final Logger logger = LoggerFactory.getLogger(ScheduledHandler.class);
    @Autowired
    private AsyncWorker asyncWorker;

    @Scheduled(cron = "0/5 * * * * ?")
    public void run() {
        logger.info("Scheduled cron = 0/5 * * * * ?");
        asyncWorker.work();
    }
}

