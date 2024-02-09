package exceptions;
import exceptions.BankAccount;
import exceptions.BankAccount.InsufficientFundsException;
import exceptions.BankAccount.InvalidWithdrawalException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testValidWithdrawal() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount bankAccount = new BankAccount(1000.0);
        bankAccount.withdraw(500.0);
        assertEquals(500.0, bankAccount.balance, 0.01);
    }

    @Test
    public void testInvalidWithdrawalAmount() {
        BankAccount bankAccount = new BankAccount(1000.0);
        assertThrows(InvalidWithdrawalException.class, () -> bankAccount.withdraw(-500.0));
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount bankAccount = new BankAccount(100.0);
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(200.0));
    }

    @Test
    public void testValidWithdrawalWithZeroBalance() {
        BankAccount bankAccount = new BankAccount(0.0);
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(200.0));
    }

    @Test
    public void testWithdrawalWithExactBalance() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount bankAccount = new BankAccount(100.0);
        bankAccount.withdraw(100.0);
        assertEquals(0.0, bankAccount.balance, 0.01);
    }
}
