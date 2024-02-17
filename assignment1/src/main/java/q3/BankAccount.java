package q3;

public class BankAccount
{
    private int accountNumber;
    private String name;
    private float balance;

    public BankAccount(int accountNumber, String name, int initialBalance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
        if (this.balance < 0)
            this.balance = 0;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public boolean deposit(float amount)
    {
        if (amount < 0)
            return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(float amount)
    {
        if (amount < 0)
            return false;
        if (balance - amount < 0)
            return false;
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount account, float amount)
    {
        if (amount < 0 || !this.withdraw(amount))
        {
            return false;
        }
        return account.deposit(amount);
    }

    public String toString()
    {
        return "account number: " + accountNumber + ", name: " + name + ", balance: " + balance;
    }
}
