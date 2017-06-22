import java.io.*;
import java.util.*;
public class pangram
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int cunt=0;
    String s=sc.nextLine();
    String res=s.replaceAll(" ","").toLowerCase();
    char arr[]=res.toCharArray();
    for(int i=0;i<res.length();i++)
    {
        if(res.charAt(i)>='a' && res.charAt(i)<='z')
        {
         cunt=cunt+1;
         res=res.replace(res.charAt(i),' ');
        }
    }
    if(cunt==26)
    {
        System.out.println("pangram");
    }

    else
    {
        System.out.println("not a pangram");
    }
}}
