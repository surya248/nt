import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int m=1000000007;
            
            BigInteger ans=fac(a+b).divide(fac(a)).divide(fac(b));
            ans=ans.mod(BigInteger.valueOf(m));
            System.out.println(ans);
        }
    }
    public static BigInteger fac(int n)
    {
        BigInteger f;
        f=BigInteger.valueOf(1);
        for(int i=2;i<=n;i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
