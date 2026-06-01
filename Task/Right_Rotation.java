import java.util.*;
class Right_Rotation
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
    int k=2;
     Reverse(arr,0,n-1);
     Reverse(arr,0,k-1);
     Reverse(arr,k,n-1);
     for(int num:arr)
     {
        System.out.print(num+" ");
     }
    }
    static void Reverse(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}

