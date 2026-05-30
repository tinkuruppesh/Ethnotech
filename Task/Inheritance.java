class A
{
    void eat()
    {
        System.out.println("Eating !!");
    }
}
class B extends A
{
    void sleep()
    {
        System.out.println("Sleep !!");
    }
}
class Inheritance
{
    public static void main(String[] args)
    {
        B b=new B();
        b.eat();
        b.sleep();
    }
}