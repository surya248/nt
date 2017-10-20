import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int [] prime=new int [2000001];
        for(int i=2;i<2000000;i++)
        {
            if(prime[i]==0)
            {
                for(int j=2;i*j<=2000000;j++)
                {
                    prime[i*j]=1;
                }
            }
        }
        int [] m=new int [2000001];
        for(int i=2;i<2000000;i++)
        {
            if(prime[i]==0){
            for(int j=1;i*j<=2000000;j++)
            {
                m[i*j]++;
            }
        }}
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        for(int i=2;i<=n;i++)
        {
            int c=1;
            for(int j=0;j<k;j++)
            {
                if(m[i+j]!=k)
                {
                    c=0;
                    break;
                }
            }
            if(c==1)
            {
                System.out.println(i);
            }
        }
    }
}
