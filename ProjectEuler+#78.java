import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] pent = new int [801];
        int j=0;
        for(int i=1;i<400;i=i+2)
        {
            int k=i/2+1;
            int l=-i/2-1;
            pent[j+1]=k*(3*k+1)/2;
            pent[j]=l*(3*l+1)/2;
            j=j+2;
            if(pent[j]>60000||pent[j+1]>60000)
            {
                break;
            }            
        }
        long [] ways=new long [60001];
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;
        long m=1000000007;
        for(int i=3;i<60001;i++)
        {
            for(int k=0;pent[k]<=i;k++)
            {
                if(k%4==0||k%4==1)
                {
                    ways[i]=(ways[i] %m);
                    ways[i-pent[k]]=(ways[i-pent[k]] %m);
                    ways[i]=(ways[i]+ways[i-pent[k]]) %m;
                }
                if(k%4==2||k%4==3)
                {
                    ways[i]=(ways[i] %m);
                    ways[i-pent[k]]=(ways[i-pent[k]] %m);
                    ways[i]=(ways[i]-ways[i-pent[k]]) %m;
                }
            }
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int w=in.nextInt();
            if(ways[w]<0)
            {
                ways[w]=ways[w]+m;
            }
                System.out.println(ways[w]%m);
        }
    }
}
