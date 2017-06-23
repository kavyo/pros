import java.io.*;
import java.util.*;
public class digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String y=sc.next();
        char ch[]=y.toCharArray();
        Arrays.sort(ch);
        int k=sc.nextInt();
        String s=String.valueOf(ch);
        int i=s.length();
        int o=i-k;
        String yo=(s.substring(0,o));
        System.out.println(yo);
    }
}


