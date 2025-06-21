package com.SingeltonLogin;

import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("--- Login System Logger Verification (SOLID Compliant) ---");

        ILogger appLogger1 = LoggerProvider.getLogger();

        System.out.print("Enter first log message: ");
        String message1 = inputReader.nextLine();
        appLogger1.logActivity(message1);

        ILogger appLogger2 = LoggerProvider.getLogger();

        System.out.print("Enter second log message: ");
        String message2 = inputReader.nextLine();
        appLogger2.logActivity(message2);

        if (appLogger1 == appLogger2) {
            System.out.println("Validation: Both logger references point to the same instance. Expected behavior for Singleton.");
        } else {
            System.out.println("Validation: Separate logger instances found. Singleton pattern violation!");
        }

        ILogger appLogger3 = LoggerProvider.getLogger();
        System.out.print("Enter third log message: ");
        String message3 = inputReader.nextLine();
        appLogger3.logActivity(message3);

        inputReader.close();
    }
}
