package q3;

import java.util.ArrayList;

public class AccountManager
{
    private ArrayList<BankAccount> accountList;

    public AccountManager()
    {
        accountList = new ArrayList<BankAccount>();
    }

    public BankAccount find(int accountNumber)
    {
        int i = 0;
        while(i < accountList.size())
        {
            if(accountList.get(i).getAccountNumber() == accountNumber)
            {
                return accountList.get(i);
            }
            i++;
        }
        return null;
    }
    public void create(int accountNumber, String name, int initialBalance)
    {
        accountList.add(new BankAccount(accountNumber, name, initialBalance));
    }
    public void delete(int accountNumber)
    {
        BankAccount account = this.find(accountNumber);
        if(account != null)
            accountList.remove(account);
    }
    public void deposit(int accountNumber, float amount)
    {
        BankAccount account = this.find(accountNumber);
        if(account != null)
            account.deposit(amount);
    }
    public void withdraw(int accountNumber, float amount)
    {
        BankAccount account = this.find(accountNumber);
        if(account != null)
            account.withdraw(amount);
    }
}
