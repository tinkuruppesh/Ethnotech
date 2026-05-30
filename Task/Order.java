abstract class Order
{
    abstract void orderPayment();  
    void orderItems(String item,int quantity,int amount)
    {
        System.out.println("Food items : " + item);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total bill : " + amount);
    }
    void OrderConfirm()
    {
        System.out.println("Order Sir/Madam");
    }
}
class PizzaOrder extends Order
{
    public void orderPayment()
    {
        System.out.println("Pizza payment completed");
    }
    void OrderConfirm()
    {
        super.OrderConfirm();
        System.out.println("Pizza is being prepared");
    }
}
class FoodOrder extends Order
{
    public void orderPayment()
    {
        System.out.println("Payment Completed !!");
    }
    void OrderConfirm()
    {
        super.OrderConfirm();
        System.out.println("Ready to Serve delicious Items ");
    }
    public static void main(String args[])
    {
        FoodOrder f = new FoodOrder();
        System.out.println(" Food Items ");
        f.OrderConfirm();
        f.orderItems("Biryani", 3, 750);
        f.orderPayment();
        System.out.println();
        System.out.println("Pizza - Eat & Enjoy ");
        f.OrderConfirm();
        f.orderItems("Pizza", 2, 200);
        f.orderPayment();
    }
}   