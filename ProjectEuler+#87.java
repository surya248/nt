import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] primes=new int [4000];
        for(int i=2;i<4000;i++)
        {
            if(primes[i]==0)
            {
                for(int j=2;i*j<4000;j++)
                primes[i*j]=1;
            }
        }
        primes[0]=1;
        primes[1]=1;
        int [] ans=new int [10000001];
        for(int i=2;i<4000;i++)
        {
            for(int j=2;j*j*j<10000001-i*i;j++)
            {
                for(int k=2;k*k*k*k<10000001-i*i-j*j*j;k++)
                {
                    if(primes[i]==0&&primes[j]==0&&primes[k]==0)
                    {
                        ans[i*i+j*j*j+k*k*k*k]=1;
                    }
                }
            }
        }
        for(int i=1;i<10000001;i++)
        {
            ans[i]=ans[i]+ans[i-1];
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int q=in.nextInt();
            System.out.println(ans[q]);
        }
        
    }
}
