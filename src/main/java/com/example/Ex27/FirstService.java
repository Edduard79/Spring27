package com.example.Ex27;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class FirstService {

    @Value("${custom.env.int1}")
    private int int1;

    @Value("${custom.env.int2}")
    private int int2;
    private Logger logger = LoggerFactory.getLogger(FirstService.class);

    public String getWelcomeMessage() {
        String message = "Welcome to my app!";
        logger.info(message);
        return message;
    }


    public int getExponent() {

        logger.debug("Start calculation for {} and {}", int1, int2);
        int result = (int) Math.pow(int1, int2);
        logger.debug("Result is: {}", result);
        return result;
    }


}
