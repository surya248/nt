import java.io.*;
import java.util.*;

public class Solution {
    static long [] collatz=new long [5000001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        collatz[2]=1;
        collatz[3]=7;
        for(int i=4;i<5000000;i++)
        {
            collatz[i]=c(i);
        }
        int u=2;
        long v=1;
        for(int i=2;i<5000000;i++)
        {
             if(collatz[i]<v)
             {
                 collatz[i]=u;
             }
            else
            {
                v=collatz[i];
                collatz[i]=i;
                u=i;
            }
        }
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            int t=in.nextInt();
            System.out.println(collatz[t]);
        }
    }
    public static long c(long n)
    {
        
        if(n%2==0)
        {
          if(n<10000000){
              int u=(int)n/2;
            if(collatz[u]!=0)
                return collatz[u]+1;
            else
                return c(n/2)+1;}
           return c(n/2)+1; 
        }
        else
        {
            return c((3*n+1)/2)+2;
        }
            
    }
}
