package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final static Logger logger = LoggerFactory.getLogger(TestService.class);

    public String logService() {
        logger.info("service");
        return "hello logback";
    }
}
