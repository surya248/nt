import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long [] f=new long [13];
        f[1]=1;
        
        for(int i=2;i<13;i++)
        {
            f[i]=i*f[i-1];
        }
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            ArrayList<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("f");
        a.add("g");
        a.add("h");
        a.add("i");
        a.add("j");
        a.add("k");
        a.add("l");
        a.add("m");
            long q=in.nextLong();
            q--;
            String s=new String();
            for(int i=12;i>0;i--)
            {
                long u=q%f[i];
                long v=q/f[i];
                int x=(int)v;
                q=u;
                if(a.size()>=0){
                s=s+a.get(x);
                
                a.remove(x);}
                Collections.sort(a);
            }
            s=s+a.get(0);
            System.out.println(s);
        }
    }
}
