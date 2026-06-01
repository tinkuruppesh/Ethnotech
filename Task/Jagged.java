//one Student has 2subjects 2 nd student has 3 subjects and 3rd student has 5 subjects 
import java.util.*;
class Jagged{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        // Creating a jagged array
    int[][] arr=new int[3][];
    arr[0]=new int[2];
    arr[1]=new int[3];
    arr[2]=new int[5];
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
    System.out.println("Marks:");
    for(int i=0;i<arr.length;i++)
    {
        int total=0;
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.println("Student "+(i+1)+" Subject "+(j+1)+" Marks are:" +arr[i][j]);
            total+=arr[i][j];
        }
        System.out.println("Total Marks of Student "+(i+1)+" is: "+total);
        System.out.println();
    }
  }
}