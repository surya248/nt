import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int [] s=new int [8];
        s[0]=1;
        s[1]=2;
        s[2]=5;
        s[3]=10;
        s[4]=20;
        s[5]=50;
        s[6]=100;
        s[7]=200;
        long [] ways=new long [100001];
        ways[0]=1;
        int m=1000000007;
        for(int i=0;i<8;i++)
        {
           for(int j=s[i];j<100001;j++)
           {
               ways[j]=(ways[j]%m+ways[j-s[i]]%m)%m;
           }
        }
        for(int a0=0;a0<t;a0++)
        {
            int n=in.nextInt();           
            System.out.println(ways[n]);
        }
    }
}
