abstract class Order
{
    String item;
    int quantity;
    int amount;

    Order(String item, int quantity, int amount)
    {
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
    }
    abstract void orderPayment();
    double calculateFinalBill()
    {
        double gst = amount * 0.18;
        return amount + gst;
    }

    void displayOrder()
    {
        System.out.println("Item       : " + item);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Amount     : " + amount);
        System.out.println("GST (18%)  : " + (amount * 0.18));
        System.out.println("Final Bill : " + calculateFinalBill());
    }
}
class FoodOrder extends Order
{
    FoodOrder(String item, int quantity, int amount)
    {
        super(item, quantity, amount);
    }

    void orderPayment()
    {
        System.out.println("Biryani Payment Completed");
    }
}
class PizzaOrder extends Order
{
    PizzaOrder(String item, int quantity, int amount)
    {
        super(item, quantity, amount);
    }

    void orderPayment()
    {
        System.out.println("Pizza Payment Completed");
    }
}
class BurgerOrder extends Order
{
    BurgerOrder(String item, int quantity, int amount)
    {
        super(item, quantity, amount);
    }

    void orderPayment()
    {
        System.out.println("Burger Payment Completed");
    }
}
class DosaOrder extends Order
{
    DosaOrder(String item, int quantity, int amount)
    {
        super(item, quantity, amount);
    }

    void orderPayment()
    {
        System.out.println("Dosa Payment Completed");
    }
}
class FriedRiceOrder extends Order
{
    FriedRiceOrder(String item, int quantity, int amount)
    {
        super(item, quantity, amount);
    }

    void orderPayment()
    {
        System.out.println("Fried Rice Payment Completed");
    }
}
class IceCreamOrder extends Order
{
    IceCreamOrder(String item, int quantity, int amount)
    {
        super(item, quantity, amount);
    }

    void orderPayment()
    {
        System.out.println("Ice Cream Payment Completed");
    }
}
class Food
{
    public static void main(String args[])
    {
        FoodOrder f = new FoodOrder("Chicken Biryani", 3, 750);
        System.out.println("===== BIRYANI ORDER =====");
        f.displayOrder();
        f.orderPayment();
        System.out.println();
        PizzaOrder p = new PizzaOrder("Pizza", 2, 400);
        System.out.println("===== PIZZA ORDER =====");
        p.displayOrder();
        p.orderPayment();
        System.out.println();
        BurgerOrder b = new BurgerOrder("Burger", 2, 300);
        System.out.println("===== BURGER ORDER =====");
        b.displayOrder();
        b.orderPayment();
        System.out.println();
        DosaOrder d = new DosaOrder("Masala Dosa", 4, 240);
        System.out.println("===== DOSA ORDER =====");
        d.displayOrder();
        d.orderPayment();
        System.out.println();
        FriedRiceOrder fr = new FriedRiceOrder("Fried Rice", 2, 350);
        System.out.println("===== FRIED RICE ORDER =====");
        fr.displayOrder();
        fr.orderPayment();
        System.out.println();
        IceCreamOrder i = new IceCreamOrder("Chocolate Ice Cream", 3, 180);
        System.out.println("===== ICE CREAM ORDER =====");
        i.displayOrder();
        i.orderPayment();
    }
}