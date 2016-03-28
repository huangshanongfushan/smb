package com.duplicall.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by raymond on 2016/3/24.
 */
@Component("testB")
public class TestB {
    private static Logger logger = Logger.getLogger(TestB.class);

    public void so() {
        logger.info("===========+++++===========");
    }

}
