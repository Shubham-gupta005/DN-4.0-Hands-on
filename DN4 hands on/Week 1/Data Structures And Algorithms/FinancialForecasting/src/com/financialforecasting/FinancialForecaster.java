package com.financialforecasting;

public class FinancialForecaster {

    public double calculateFutureValueRecursive(double presentValue, double annualGrowthRate, int numberOfYears) {
        if (numberOfYears < 0) {
            throw new IllegalArgumentException("Invalid year count.");
        }
        if (numberOfYears == 0) {
            return presentValue;
        } else {
            return calculateFutureValueRecursive(presentValue, annualGrowthRate, numberOfYears - 1) * (1 + annualGrowthRate);
        }
    }
}