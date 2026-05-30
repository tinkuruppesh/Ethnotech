class Main
{
    void Name(String name)
    {
        System.out.println("Employee Name: " + name);
    }
    void Salary(int sal)
    {
        System.out.println("Employee Salary: " + sal);
    }
    void role(String dev)
    {
        System.out.println("Developer: " + dev);
    }
}
class Employee extends Main
{
    public static void main(String[] args)
    {
        Main m=new Main();
        m.Name("Tinku");
        m.Salary(45000);
        m.role("Developer");
    }
}