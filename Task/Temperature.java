import java.util.*;
class Temperature
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int[] arr=new int[n];
      for(int i=0;i<n;i++)
       {
          arr[i]=s.nextInt();
       }
       int max=arr[0];
       int min=arr[0];
       int sum=0;
       for(int i=0;i<n;i++)
       {
          sum+=arr[i];
         if(arr[i]>max)
         {
            max=arr[i];
         }
         if(arr[i]<min)
         {
            min=arr[i];
         }
       }
       int count=0;
       for(int i=0;i<n;i++)
       {
            if(arr[i]>35)
            {
                count++;
            }
       }
       int average=sum/n;
       System.out.println("Maximum Temperatire:"+max);
       System.out.println("Minimum Temp:"+min);
       System.out.println("Average Temp:"+average);
       System.out.println("No of hot days > 35 C"+count);
    }
}