import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] prime = new int [1001];
        for(int i=2;i<1001;i++)
        {
           if(prime[i]==0)
           {
               for(int j=2;i*j<1001;j++)
               {
                   prime[i*j]=1;
               }
           }
        }
        prime[1]=1;
        prime[0]=1;
        long [] sum=new long [1001];
        int m=1000000007;
        sum[0]=1;
        for(int i=1;i<1001;i++)
        {
                            if(prime[i]==0)
                {
            for(int j=i;j<=1000;j++)
            {

                    sum[j]=(sum[j]+sum[j-i]);
                }
            }
        }        
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int a=0;a<t;a++)
        { 
            int n=in.nextInt();
            System.out.println(sum[n]);
        }
    }
}
