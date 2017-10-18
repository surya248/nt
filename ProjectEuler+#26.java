import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] n=new int [10001];
        n[3]=1;
        for(int i=5;i<10000;i+=2)
        {
            n[i]=1;
            int count=0;
            if(i%5!=0){
            while(n[i]!=0&&n[i]!=1||count==0)
            {
                n[i]=n[i]*10;
                n[i]=n[i]%i;
                count++;
            }
            n[i]=count;
            
            }
        }
        int v=3;
        for(int i=4;i<10001;i++)
        {
            if(n[i]<n[v])
            {
                n[i]=v;
            }
            else
            {
                v=i;
                n[i]=i;
            }
        }
        n[3]=3;
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int m=in.nextInt();
            System.out.println(n[m-1]);
        }
    }
}
