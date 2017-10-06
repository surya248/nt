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
            int n = in.nextInt();
            long pr=1;
            for(int i=2;i<=n;i++)
            {
                pr=i*pr/gcd(pr,i);
            }
            System.out.println(pr);
        }
    }
    public static long gcd(long a,long b)
    {
        if(a%b==0)
        {
            return b;
        }
        return gcd(b,a%b);
    }
}
