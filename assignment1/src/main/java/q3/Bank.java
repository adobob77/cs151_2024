package q3;

public class Bank
{
    public static void main(String[] args)
    {
        AccountManager manager = new AccountManager();
        manager.create(1, "account 1", 0);
        manager.create(2, "account 2", 100);
        manager.create(3, "account 3", 500);
        manager.create(4, "account 4", 700);
        manager.create(5, "account 5", 100000);
        manager.find(5).transfer(manager.find(1), 50);
        manager.find(4).transfer(manager.find(2), -50);
        manager.find(3).transfer(manager.find(2), 500);
        manager.find(2).transfer(manager.find(4), 0);
        manager.find(5).transfer(manager.find(5), 1000);
        manager.find(6);

        System.out.println(manager.find(1).toString());
        System.out.println(manager.find(2).toString());
        System.out.println(manager.find(3).toString());
        System.out.println(manager.find(4).toString());
        System.out.println(manager.find(5).toString());
    }
}
