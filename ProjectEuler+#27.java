import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] prime=new int [1000001];
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
        int count=0;
        int sum=0;
        int amax=0;
        int bmax=0;
        for(int b=n;b>0;b--)
        {
            if(prime[mod(b)]==0)
            {
                for(int a=-n;a<=n;a++)
                {
                    sum=0;
                    for(int x=0;;x++)
                    {
                        if(x*x+a*x+b>0){
                        if(prime[x*x+a*x+b]==0)
                        {
                            sum++;
                        }
                        else
                        {
                            if(sum>count)
                            {
                                count=sum;
                                amax=a;
                                bmax=b;
                                sum=0;
                            }
                            break;
                        }
                    }
                     else
                        {
                            if(sum>count)
                            {
                                count=sum;
                                amax=a;
                                bmax=b;
                                sum=0;
                            }
                            break;
                        }}
                }
            }
        }
        System.out.println(amax+" "+bmax);
    }
    public static int mod(int n)
    {
        if(n<0)
        {
            return -n;
        }
        return n;
    }
}
