package com.app.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogger {
    private static final Logger log = LoggerFactory.getLogger(MyLogger.class);

    public static void main(String[] args) {
        log.error("Ops, something failed!");
        log.warn("Heads up, potential issue detected.");
    }
}