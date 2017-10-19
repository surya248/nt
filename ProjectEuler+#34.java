import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int y=0;
        for(int i=10;i<n;i++)
        {
            if(sum(i)%i==0)
            {
                y=y+i;
            }
        }
        System.out.println(y);
        
    }
    public static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            int q=n%10;
            int l=1;
            for(int i=1;i<=q;i++)
            {
                l=l*i;
            }
            s=s+l;
            n=n/10;
        }
        return s;
    }
}
