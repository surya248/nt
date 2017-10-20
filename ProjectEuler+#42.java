import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int a0=0;a0<t;a0++)
        {
            long k=in.nextLong();
            double n=Math.sqrt(8*k+1);
            long m=(long) n;
            double l=m;
            if(l==n)
            {
                System.out.println((m-1)/2);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}
