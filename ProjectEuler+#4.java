import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a= new int [1000000];
        for(int i=100;i<1000;i++)
        {
            for(int j=100;j<1000;j++)
            {
                if(pal(i*j)==1)
                {
                    a[i*j]=1;
                }
            }
        }
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            n--;
            while(true)
            {
                if(a[n]==1)
                {
                    break;
                }
                n--;
            }
            System.out.println(n);
        }
    }
    public static int pal(int n)
    {
        int l=0;
        int m=n;
        int q=0;
        while(m>0)
        {
            q=q*10+(m%10);
            m=m/10;
        }
        if(q==n)
        {
            return 1;
        }
        return 0;
    }
}
