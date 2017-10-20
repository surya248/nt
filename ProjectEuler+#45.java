import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong(); 
        int k=in.nextInt();
        double p = (Math.sqrt(1 + 24 * n) + 1.0) / 6.0;
        int h=(int)p;
        for(int i=1;i<h;i++)
        {
            long b=i;
            long u=b*(3*b-1)/2;
            if(k==3)
            {
                if(ist(u)==1)
                {
                    System.out.println(u);
                }
            }
            else
            {
                if(ish(u)==1)
                {
                    System.out.println(u);
                }
            }
        }
    }
    public static int ist(long n)
    {
        double p = (Math.sqrt(1 + 8 * n) - 1.0) / 2.0;
        if (p == ((int)p))
            return 1;
        return 0;
    }
     public static int ish(long n)
    {
        double p = (Math.sqrt(1 + 8 * n) + 1.0) / 4.0;
        if (p == ((int)p))
            return 1;
        return 0;
    }
         public static int isp(long n)
    {
        double p = (Math.sqrt(1 + 24 * n) + 1.0) / 6.0;
        if (p == ((int)p))
            return 1;
        return 0;
    }
}
