
package com.duplicall.config;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class TaskConfig {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    private static int count = 0;

//    //fixedRate: 从上一个任务开始到下一个任务开始的间隔，单位是毫秒。
//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTime() {
//        System.out.println("The time is now " + simpleDateFormat.format(new Date()));
//    }

    @Scheduled(cron = "0 0 23 * * ?")
    public void repeatShowMsg() {
        System.out.println("repeat show message: " + (++count));
    }

}
