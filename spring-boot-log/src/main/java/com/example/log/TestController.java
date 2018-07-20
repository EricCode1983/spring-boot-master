package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService mUserService;

    @RequestMapping("/")
    public String showIndex() {
        logger.info("hello world for log");
        logger.debug("hello world for log");
        logger.warn("hello world for log");
        return "hello world for log";
    }

    @GetMapping("/log")
    public String logController() {
        logger.info("controller");
        return mUserService.logService();
    }
}
