/* 
interface UpiPayments
{
    void pay();
}
interface CashPayments
{
    void cash();
}
class Payments implements UpiPayments,CashPayments
{
    public void pay()
    {
        System.out.println("UPI Accepted  Phonpe/Gpay/Paytm Successfully");
    }
    public void cash()
    {
        System.out.println("Cash Accepted Successfully");
    }
}
public class UPI
{
    public static void main(String args[])
    {
        Payments i=new Payments();
        i.pay();
        i.cash();
    }
}
*/
interface Notification
{
    void message(String message);
}
class Instagram implements Notification
{
    public void message(String message)
    {
        System.out.println("Insta Notification:"+message);
    }
}
class LinkedIn implements Notification
{
    public void message(String message)
    {
        System.out.println("Linked-In Notification :"+message);
    }
}
class NotificationSystem
{
    public static void main(String args[])
    {
        Instagram i=new Instagram();
        LinkedIn l=new LinkedIn();
        i.message("Tinku sent a reel");
        l.message("Ethnotech is Hiring apply .");
    }
}