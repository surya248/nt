import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        int [] prime = new int [400000];
        for(int i=2;i<400000;i++)
        {
            if(prime[i]==0)
            {
                for(int j=2;j*i<400000;j++)
                {
                    prime[i*j]=1;
                }
            }
        }
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int a0=0;a0<t;a0++)
        {
            long n=in.nextLong();
            BigInteger p=BigInteger.valueOf(2);
            for(int i=3;;i++)
            {
                if(prime[i]==0&&p.multiply(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(n))==-1)
                {
                    p=p.multiply(BigInteger.valueOf(i));                
                }
                if(p.multiply(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(n))==1)
                    {
                        break;
                    }
            }
            System.out.println(p);
        }
    }
}
