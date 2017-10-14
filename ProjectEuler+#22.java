import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String [] a=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.next();
        }
        Arrays.sort(a);
        int q=in.nextInt();
        for(int j=0;j<q;j++)
        {
            String i=in.next();
           int m= Arrays.binarySearch(a,i);
            int v=val(i);
            System.out.println(v*(m+1));
        }
    }
    public static int val(String s)
    {
        int n=s.length();
        int z=0;
        for(int i=0;i<n;i++)
        {
            char q=s.charAt(i);
            int p=(int)q;
            
            p=p-64;
            
            z=z+p;
        }
       
        return z;
    }
}
