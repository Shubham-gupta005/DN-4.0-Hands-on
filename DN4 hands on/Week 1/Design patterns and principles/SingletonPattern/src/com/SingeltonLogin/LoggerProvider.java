package com.SingeltonLogin;

public class LoggerProvider {
    private static ILogger loggerInstance;

    private LoggerProvider() {
    }

    public static synchronized ILogger getLogger() {
        if (loggerInstance == null) {
            loggerInstance = new ConsoleLogger();
        }
        return loggerInstance;
    }
}
