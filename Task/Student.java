 public class Student
{
    private int id;
    private String name;
    public void setBankBalance(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId()
    {
        return id;
    }
     public String getName()
    {
        return name;
    }
    public static void main(String args[])
    {
        Student s=new Student();
        s.setBankBalance(5000,"tinku");
        System.out.println("Bank Balance:"+s.getId());
        System.out.println("bank name:"+s.getName());
    }
}
