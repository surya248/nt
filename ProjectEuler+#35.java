import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] prime = new int [1000001];
        for(int i=2;i<=1000000;i++)
        {
            if(prime[i]==0)
            {
                for(int j=2;i*j<=1000000;j++)
                {
                    prime[i*j]=1;
                }
            }
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long sum=17;
        for(int i=10;i<n;i++)
        {
            if(prime[i]==0)
            {
                int w=i;
                int q=rotate(i);
                int s=0;
                while(q!=i)
                {
                    if(prime[q]!=0)
                    {
                        s=1;
                        break;
                    }
                    q=rotate(q);
                }
                if(s==0)
                sum=sum+q;
            }
        }
        System.out.println(sum);
        
    }
    public static int rotate(int n)
    {
        int q=n%10;
        n=n/10;
        int l=n;
        while(l>0)
        {
            l=l/10;
            q=q*10;
        }
        n=n+q;
        return n;
    }
}
