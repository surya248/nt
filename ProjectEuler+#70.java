import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] prime = new int [6000000];
        for(int i=2;i<6000000;i++)
        {
            if(prime[i]==0)
            {
                for(int j=2;i*j<6000000;j++)
                {
                    prime[i*j]++;
                }
            }
        }
        double [] phi = new double [5000];
        for(int i=2;i<5000;i++)
        {
            phi[i]=i;
        }
        for(int i=2;i<5000;i++)
        {
            if(prime[i]==0)
            {
                for(int j=1;i*j<5000;j++)
                {
                    double k=i;
                    phi[i*j]=phi[i*j]*((k-1)/k);
                }
            }
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int min=21;
        double mini=1.75;
        if(n>4999)
        {
        for(int i=2;i<10000;i++)
        {
            if(prime[i]==0)
            {
            for(int j=2;i*j<n;j++)
            {
                if(prime[j]==0)
                {
                    if(same(i*j,(i-1)*(j-1))==0)
                    {
                        double u=(double)i*j/((i-1)*(j-1));
                        if(u<mini)
                        {
                            min=i*j;
                            mini=u;
                        }
                    }
                }
            }
        }
        }}
        else
        {
            for(int i=20;i<n;i++)
            {
                int u=(int)phi[i];
                if(same(i,u)==0)
                {
                    double x=(double)i/phi[i];
                if(x<mini)
                {
                    mini=x;
                    min=i;
                }
            }}
        }
        System.out.println(min);
    }
    public static int same(int m,int n)
    {
        String s1=String.valueOf(m);
        String s2=String.valueOf(n);
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String s3 = new String(charArray);
        char[] charArray1 = s2.toCharArray();
        Arrays.sort(charArray1);
        String s4 = new String(charArray1);
        if(s3.compareTo(s4)==0)
        {
            return 0;
        }
        return 1;
}
}
