import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [] t=new int [1000001];
        t[0]=2;
        for(int i=1;i<1000001;i++)
        {
            long [] temp=new long [61];
            temp[0]=i;
            int b=0;
            for(int j=0;;j++)
            {
                long k=temp[j];
                long sum=0;
                while(k>0)
                {
                    int l=(int) k%10;
                    sum=sum+fac(l);
                    k=k/10;
                }
                for(int l=0;l<=j;l++)
                {
                    if(temp[l]==sum)
                    {
                        if(j==0)
                        {
                            t[i]=1;
                        }
                        if(j==1)
                        {
                            t[i]=2;
                        }
                        else
                        {
                            t[i]=j+1;
                        }
                        b=1;
                    }
                }
                if(b==0)
                {
                    temp[j+1]=sum;
                }
                if(b==1)
                {
                    break;
                }                
            }
        }
        Scanner in = new Scanner(System.in);
        int inp=in.nextInt();
        for(int i=0;i<inp;i++)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int b=0;
            for(int j=0;j<=n;j++)
            {
                if(t[j]==k)
                {
                    b++;
                    System.out.print(j+" ");
                }                
            }
            if(b==0)
            {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
    public static long fac(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if (n==3)
        {
            return 6;
        }
        if(n==4)
        {
            return 24;
        }
        if(n==5)
        {
            return 120;
        }
        if(n==6)
        {
            return 720;
        }
        if(n==7)
        {
            return 5040;
        }
        if(n==8)
        {
            return 40320;
        }
        if(n==9)
        {
            return 362880;
        }
        return 1;
    }
}
