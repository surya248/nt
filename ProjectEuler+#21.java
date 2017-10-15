import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a=new int [400001];
        for(int i=1;i<200000;i++)
        {
            for(int j=2;i*j<400000;j++)
            {
                a[i*j]+=i;
            }
        }
        int c=0;
        int [] b=new int [100001];
        for(int i=2;i<=100000;i++)
        {
            if(i==a[a[i]]&&i!=a[i])
            {
                b[i]=i;
            }
            b[i]=b[i]+b[i-1];
        }
        
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            int m=in.nextInt();
            System.out.println(b[m]);
        }
    }
}
