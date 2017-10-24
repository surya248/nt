import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] p=new int [5000001];
        for(int u=2;u<2000;u++)
        {
            for(int v=1;v<u;v++)
            {
                long z=2*u*(u+v);
                if(z<=5000000&&z>0&&gcd(u,v)==1&&(u%2==0||v%2==0))
                {
                    int r=(int)z;                    
                    p[r]++;
                    for(int k=2;k*r<=5000000;k++)
                    {
                        p[r*k]++;
                    }
                }
            }            
        }
        int max=0;
        for(int i=12;i<=5000000;i++)
        {
            if(p[i]==1)
            {
                max++;
                p[i]=max;
            }
            else
            {
                p[i]=max;
            }
        }
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int w=in.nextInt();
            System.out.println(p[w]);
        }

    }
    public static int gcd(int a,int b)
    {
        if(a%b==0)
        {
            return b;
        }
        return gcd(b,a%b);
    }
}
