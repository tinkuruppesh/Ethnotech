class Customer extends Bank
{
    public Customer(String name, int balance) {
        super(name, balance);
    }

    public static void main(String args[])
    {
        Customer c = new Customer("tinku", 1000);
        c.getBankDetails();
        c.deposit(500);
        c.withdraw(100);
        System.out.println("Balance:"+c.getBalance());
    }
}
