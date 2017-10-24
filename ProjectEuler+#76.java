import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       long [] sum=new long [1001];
        int m=1000000007;
        sum[0]=1;
        for(int i=1;i<1001;i++)
        {
            for(int j=i;j<=1000;j++)
            {
                sum[j]=(sum[j]%m+sum[j-i]%m)%m;
            }
        }        
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int a=0;a<t;a++)
        { 
            int n=in.nextInt();
            System.out.println(sum[n]-1);
        }
    }
}
