import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        for(int i=125874;i<=n;i++)
        {
            int c=0;
            for(int j=2;j<=k;j++)
            {
                if(same(i,j*i)!=0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                for(int j=1;j<=k;j++)
                {
                    System.out.print(i*j+" ");
                }
                System.out.println("");
            }
        }
    }
    public static int same(int m,int n)
    {
        String s1=String.valueOf(m);
        String s2=String.valueOf(n);
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String s3 = new String(charArray);
        char[] charArray1 = s2.toCharArray();
        Arrays.sort(charArray1);
        String s4 = new String(charArray1);
        if(s3.compareTo(s4)==0)
        {
            return 0;
        }
        return 1;
    }
}
