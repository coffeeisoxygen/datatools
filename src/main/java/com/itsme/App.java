package com.itsme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application starting...");
        logger.debug("Debug mode enabled");
        logger.info("Hello World!");
    }
}
