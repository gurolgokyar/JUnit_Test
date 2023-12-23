package test.java.week_16;

import main.java.week_16.BankAccount;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount account = new BankAccount();

    @Test
    void testDepositPositiveAmount(){
        account.deposit(100);
    }

    @Test
    void testWithdrawWithSufficientFunds(){
        account.withdraw(30);
    }

    @Test
    void testWithdrawWithExceedingBalance(){
        account.withdraw(71);
    }

    @Test
    void testDepositNegativeAmount(){
        account.deposit(-100);
    }

    @Test
    void testWithdrawWithNegativeAmount(){
        account.withdraw(30);
    }
}
