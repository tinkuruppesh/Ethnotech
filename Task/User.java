public class User
{
    void fare()
    {
        System.out.println("I need to go to Nagawara - TinFactory");
        System.out.println(" Available rides are: ");
    }
}
class Auto extends User
{
    int amount=180;
    void fare()
    {
        System.out.println("AUTO Charge is :"+amount);
    }
}
class Car extends User
{
    int amount=250;
    void fare()
    {
        System.out.println("CAR with A/C :"+amount);
    }
}
class Bike extends User
{
    int amount=80;
    void fare()
    {
        System.out.println("Bike Charge :"+amount);
    }
}
class Uber
{
     public static void main(String args[])
     {
        User u=new User();
        Auto a=new Auto();
        Bike b=new Bike();
        Car c=new Car();
        u.fare();
        a.fare();
        b.fare();
        c.fare();
        int min=a.amount;
        String vehicle="Auto";
         if(b.amount < min)
        {
            min = b.amount;
            vehicle = "Bike";
        }
        if(c.amount < min)
        {
            min = c.amount;
            vehicle = "Car";
        }
        System.out.println();
        System.out.println("Minimum Fare : " + min);
        System.out.println("Recommended Vehicle : " + vehicle);
     }
}