import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] m=new int [50001];
           
            for(int i=2;i<=50000;i++)
            {
                int s=2;
                for(int j=2;j*j<=i;j++)
                {
                    
                    if(i%j==0)
                    {
                       s=s+2;
                    }
                    if(j*j==i)
                    {
                        s--;
                    }
                }
                m[i]=s;
            }
        m[1]=1;
        int [] b=new int [50001];
        b[1]=1;
        for(int i=2;i<50000;i++)
        {
            if(i%2==0)
           b[i]=m[i/2]*m[i+1];
            else
            b[i]=m[i]*m[(i+1)/2];
        }
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=in.nextInt();
            int j=0;
            while(b[j]<=t)
            {
                j++;
            }
            System.out.println(j*(j+1)/2);
        }
    }
}
