import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum=0;
            long [] cur = new long [2];
            cur[0]=2;
            cur[1]=1;
            while(cur[0]<n)
            {
                sum+=cur[0];
                
                cur=mul(cur);
            }
            System.out.println(sum);
        }
    }
    public static long [] mul(long [] n)
    {
        long [] ans=new long[2];
        ans[0]=3*n[0]+2*n[1];
        ans[1]=2*n[0]+n[1];
        return ans;
    }
}
