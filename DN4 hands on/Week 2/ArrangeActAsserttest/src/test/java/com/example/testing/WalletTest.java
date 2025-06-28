package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WalletTest {

    private Wallet userWallet;

    @Before
    public void setupWallet() {
        userWallet = new Wallet(100.0);
        System.out.println("Wallet initialized with $100.00 before test.");
    }

    @After
    public void cleanupWallet() {
        userWallet = null;
        System.out.println("Wallet instance cleared after test.");
    }

    @Test
    public void testDepositFunds() {

        double depositAmount = 50.0;
        double expectedBalance = 150.0;

        userWallet.deposit(depositAmount);
        double actualBalance = userWallet.getBalance();

        assertEquals(expectedBalance, actualBalance, 0.001);
        System.out.println("Deposit test completed. Balance: $" + actualBalance);
    }

    @Test
    public void testWithdrawFundsSuccess() {

        double withdrawAmount = 30.0;
        double expectedBalance = 70.0;

        boolean success = userWallet.withdraw(withdrawAmount);
        double actualBalance = userWallet.getBalance();

        assertTrue(success);
        assertEquals(expectedBalance, actualBalance, 0.001);
        System.out.println("Successful withdrawal test completed. Balance: $" + actualBalance);
    }

    @Test
    public void testWithdrawFundsInsufficient() {

        double withdrawAmount = 200.0;
        double expectedBalance = 100.0;

        boolean success = userWallet.withdraw(withdrawAmount);
        double actualBalance = userWallet.getBalance();

        assertFalse(success);
        assertEquals(expectedBalance, actualBalance, 0.001);
        System.out.println("Insufficient withdrawal test completed. Balance: $" + actualBalance);
    }
}