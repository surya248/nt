import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            int a=in.nextInt();
            BigInteger f=new BigInteger("1");
            for(int i=0;i<a;i++)
            {
                f=f.multiply(BigInteger.valueOf(2));
            }
            BigInteger c=new BigInteger("0");
            while(f.compareTo(BigInteger.valueOf(0))>0)
            {
                BigInteger q=f.mod(BigInteger.valueOf(10));
                c=c.add(q);
                f=f.divide(BigInteger.valueOf(10));
            }
            System.out.println(c);
        }
    }
}
