import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] ans = new int [5001];
        BigInteger[] fib = new BigInteger[24000];
        fib[0] = BigInteger.valueOf(1);
        fib[1] = BigInteger.valueOf(1);
        for(int i=2;i<23999;i++)
        {
            fib[i] = fib[(i -1)].add(fib[(i -2)]);
        }
         int i = 0;
         int cnt = 2;
        BigInteger limit = BigInteger.valueOf(1);
        for(int k=2;k<=5000;k++)
        {


        limit=limit.multiply(BigInteger.valueOf(10));
        while (fib[i].compareTo(limit)<0) {
            i = i+1;
            cnt++;
            
        }
            ans[k]=cnt-1;
        }
        for(int a0=0;a0<n;a0++)
        {
            int q=in.nextInt();
        
        System.out.println(ans[q]); }   
    }
}
