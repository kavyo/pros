import java.io.*;
import java.util.*;
public class elephant
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int count=0;
    int c=0;
    int no=sc.nextInt();
    int wt=sc.nextInt();
    int arr[]=new int[no];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int j=arr.length-1;j>=0;j--)
    {
    if(count<wt)
    {
      count=count+arr[j];
      c++;
    }
    }
    System.out.println(c);
    }
}



