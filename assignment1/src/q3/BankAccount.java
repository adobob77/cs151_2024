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
        if(this.balance < 0)
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
    public void deposit(float amount)
    {
        if(amount <= 0)
            return;
        balance += amount;
    }
    public void withdraw(float amount)
    {
        if(balance - amount < 0)
            return;
        balance -= amount;
    }
    public void transfer(BankAccount account, float amount)
    {
        if(amount < 0 || this.getBalance() - amount < 0)
        {
            return;
        }
        this.withdraw(amount);
        account.deposit(amount);
    }

    public String toString()
    {
        return "account number: " + accountNumber + ", name: " + name + ", balance: " + balance;
    }
}
