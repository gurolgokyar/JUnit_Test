package test.java.week_16;

import main.java.week_16.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    static BankAccount account;

    @BeforeAll
    static void setUp() {
        account = new BankAccount();
        System.out.println("Testing is starting...\n");
    }

    @AfterAll
    static void setDown() {
        account = null;
        System.out.println("Testing finished.");
    }

    @BeforeEach
    void init() {
        account.deposit(100);
        System.out.println("Starting new test");
    }

    @AfterEach
    void teardown() {
        account.withdraw(account.getBalance());
        System.out.println("Test case finished\n");
    }

    @Test
    void testDepositWithPositiveAmount() {
        account.deposit(100);
        assertEquals(200, account.getBalance(), "TC_01:Failed\nDeposited 100 into account \nThe amount not equals to " +
                "real amount");
    }

    @Test
    void testWithdrawWithSufficientAmount() {
        account.withdraw(25);
        assertEquals(75, account.getBalance(), "TC_02:Failed\nWithdraws 25 from account \nThe amount not equals to " +
                "real amount");
    }

    @Test
    void testWithdrawWithExceedingAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(101);
        }, "TC_03:Failed \nWithdraws " +
                "exceeding amount(101) " +
                "from account \nBut withdraw method did not throw IllegalArgumentException\n");
    }

    @Test
    void testDepositWithNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-12), "TC_04:Failed\nDeposits negative " +
                "amount(-12) to " +
                "account " +
                "\nBut deposit method dit not throw IllegalArgumentException\n");
    }

    @Test
    void testWithdrawWithNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-1), "TC_05:Failed \nWithdraw negative " +
                "amount -1 from account \nBut the withdraw method did not throw IllegalArgumentException\n");
    }
}
