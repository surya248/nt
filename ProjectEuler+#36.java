import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int sum=1;
        for(int i=2;i<n;i++)
        {
            String s=String.valueOf(i);
            if(pal(s)==1&&pal(base(i,k))==1)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        
    }
    public static int pal(String s)
    {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-1-i))
            {
                return 0;
            }
        }
        return 1;
    }
    public static String base(int n,int k)
    {
        String s=new String();
        while(n>0)
        {
            s=s+String.valueOf(n%k);
            n=n/k;
        }
        return s;
    }
}
