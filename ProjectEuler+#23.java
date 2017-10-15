import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a=new int [100001];
        for(int i=1;i<50000;i++)
        {
            for(int j=2;i*j<100000;j++)
            {
                a[i*j]+=i;
            }
        }
        int [] b=new int [100001];
        for(int i=2;i<=100000;i++)
        {
            if(a[i]>i)
            {
                b[i]=1;
            }
        }
        long sum=0;
        int [] c=new int [28124];
        for(int i=24;i<28123;i++)
        {
            for(int j=12;j<=i/2;j++)
            {
                if(b[j]==1&&b[i-j]==1)
                {
                    c[i]=1;
                   
                    break;
                }
            }
        }
        
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            int m=in.nextInt();
            if(m>28123)
            {
                System.out.println("YES");
            }
            else
            {
                if(c[m]==1)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
}
