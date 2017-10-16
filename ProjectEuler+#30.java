import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=2;i<10000000;i++)
        {
            if(i==num(i,n))
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static int num(int i,int n)
    {
        int sum=0;
        while(i!=0)
        {
            int q=i%10;
            i=i/10;
            int l=1;
            for(int j=0;j<n;j++)
            {
                l=l*q;
            }
            sum=sum+l;
        }
        return sum;
    }
}
