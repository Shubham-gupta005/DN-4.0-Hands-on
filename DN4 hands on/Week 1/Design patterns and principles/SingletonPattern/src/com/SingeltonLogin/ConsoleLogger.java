package com.SingeltonLogin;

public class ConsoleLogger implements ILogger {

    // Constructor is now public, as its singleton nature is managed externally
    public ConsoleLogger() {
        System.out.println("ConsoleLogger initialized.");
    }

    @Override
    public void logActivity(String activity) {
        System.out.println("Activity Log: " + activity);
    }
}
