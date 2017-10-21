import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int max=1;
        for(int i=n/2;i<n;i++)
        {
            for(int j=n/2;j<n;j++)
            {
                BigInteger w=BigInteger.valueOf(i);
                BigInteger q=w.pow(j);
                int s=sum(q);
                if(s>max)
                {
                    max=s;
                }
            }
        }
        System.out.println(max);
    }
    public static int sum(BigInteger n)
    {
        int u=0;
        while(n.compareTo(BigInteger.valueOf(0))!=0)
        {
            BigInteger k=n.mod(BigInteger.valueOf(10));
            u=u+k.intValue();
            n=n.divide(BigInteger.valueOf(10));
        }
        return u;
    }
}
