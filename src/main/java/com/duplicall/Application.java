package com.duplicall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

/**
 * Created by raymond on 2016/3/24.
 */

@EnableAutoConfiguration
public class Application implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private RunApplication runApplication;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        final ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        runApplication.work();
    }
}
