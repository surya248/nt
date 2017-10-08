import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] p=new int [1000005];
        for(int i=0;i<1000004;i++)
        {
            p[i]=1;
        }
        for(int i=2;i<1000004;i++)
        {
            if(p[i]==1)
            {
               for(int j=2;i*j<1000004;j++)
               {
                   p[i*j]=0;
               }
            }
        }
        p[0]=0;
        p[1]=0;
        long [] pr=new long [1000005];
        pr[2]=2;
        for(int i=3;i<1000004;i++)
        {
            pr[i]=pr[i-1]+p[i]*i;
        }
        
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(pr[n]);
        }
    }
}
