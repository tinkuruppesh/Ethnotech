class Bank
{
    private String name;
    private int balance;
    public Bank(String name, int balance)
    {
        this.name = name;
        this.balance = balance;
    }
    public void getBankDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Bank : SBI");
        System.out.println("Balance : " + balance);
    }
    public void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Deposited : " + amount);
    }
    public void withdraw(int amount)
    {
        balance = balance - amount;
        if(amount<=balance)
        {
            System.out.println("Withdrawn : " + amount);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public int getBalance()
    {
        return balance;
    }
}
