import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        for(int i=k+1;i<n;i++)
        {
            long m=i;
            long q=m*(3*m-1)/2;
            long p=(m-k)*(3*(m-k)-1)/2;
            if(isp(p+q)==1||isp(q-p)==1)
            {
                System.out.println(q);
            }
        }
        
    }
    public static int isp(long n)
    {
        double p = (Math.sqrt(1 + 24 * n) + 1.0) / 6.0;
        if (p == ((int)p))
            return 1;
        return 0;
    }
}
