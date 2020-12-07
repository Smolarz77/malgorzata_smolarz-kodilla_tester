package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCountTotalBalance() { // Test bankomat: dodanie bankomatu z transakcjami
        Bank bank = new Bank ("Berliner Sparkasse");
        bank.addDepositCashMachine(100, 0);
        bank.addDepositCashMachine(100, 0);
        bank.addDepositCashMachine(150, 1);
        bank.addDepositCashMachine(50, 1);

        bank.addWithdrawCashMachine(-160, 0);
        bank.addWithdrawCashMachine(-160, 1);

        int balanceCashAmount = bank.getCashAmount();

        assertEquals(80, balanceCashAmount);
        // assertEquals(200, depositCashAmount, 0.01);
        // assertEquals(-300, withdrawCashAmount, 0.01);

    }

    @Test
    public void shouldCauntAverageWithdrawDepositAndNumberOfOperations() {
        Bank bank = new Bank("Berliner Sparkasse");
        bank.addWithdrawCashMachine(-50, 0);
        bank.addWithdrawCashMachine(-190,0);
        bank.addWithdrawCashMachine(-280, 1);
        bank.addWithdrawCashMachine(150, 1);
        bank.addDepositCashMachine(120,0);
        bank.addDepositCashMachine(160,1);


        int withdrawNumber = bank.getNumberOfWithdrawOperations();
        assertEquals(3, withdrawNumber);
        int depositNumber = bank.getNumberOfDepositOperations();
        assertEquals(2, depositNumber);

        double withdrawAverage = bank.getAverageAmountWithdrawOperations();
        assertEquals(-173.33, withdrawAverage, 0.01);
        double depositAverage = bank.getAverageAmountDepositOperations();
        assertEquals(140, depositAverage, 0.01);

    }

}