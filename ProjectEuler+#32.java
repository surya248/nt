import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int [] arr=new int[10000];
        for(int i=1;i<4000;i++)
        {
            for(int j=1;j<4000;j++)
            {
                int q=i*j;
                String s=Integer.toString(i);
                s=s+j;
                s=s+q;
                if(pan(s,n)==1)
                {if(arr[q]!=1)               
                {sum=sum+q;
                arr[q]=1;}}
            }
        }
        System.out.println(sum);
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
