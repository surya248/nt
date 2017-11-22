import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int n=in.nextInt();
        for(int i=2;i<t;i++)
        {
            String s=new String();
            for(int j=1;;j++)
            {
                s=s+i*j;
                if(s.length()>n)
                {
                    break;
                }
                if(s.length()==n)
                {
                    if(pan(s,n)==1)
                    {
                        System.out.println(i);
                    }
                }
            }
        }
    }
        public static int pan(String s,int n)
    {
        char [] c=s.toCharArray();
        if(c.length!=n)
            {
                return 0;
            }

        Arrays.sort(c);
        for(int i=0;i<n;i++)
        {
            int u=i+1;
            char v=(char)(u+'0');
            if(c[i]!=v)
            {
                return 0;
            }
        }        
        return 1;
}
}
