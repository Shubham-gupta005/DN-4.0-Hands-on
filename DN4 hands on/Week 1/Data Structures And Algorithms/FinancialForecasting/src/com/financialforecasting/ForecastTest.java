package com.financialforecasting;

import java.util.Scanner;

public class ForecastTest {
    public static void main(String[] args) {
        FinancialForecaster predictor = new FinancialForecaster();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Investment Projection Tool ---");

        System.out.print("Enter initial investment amount: $");
        double baseAmount = scanner.nextDouble();

        System.out.print("Enter annual growth rate : ");
        double gainRate = scanner.nextDouble();

        System.out.print("Enter number of projection periods in years: ");
        int periods = scanner.nextInt();

        System.out.println("\n--- Calculating Projection ---");
        System.out.println("Starting Capital: $" + String.format("%.2f", baseAmount));
        System.out.println("Annual Yield: " + (gainRate * 100) + "%");
        System.out.println("Projection Periods: " + periods);

        try {
            double finalProjection = predictor.calculateFutureValueRecursive(baseAmount, gainRate, periods);
            System.out.println("Projected Value after " + periods + " periods: $" + String.format("%.2f", finalProjection));

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}