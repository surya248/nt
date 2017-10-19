import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int a0=0;a0<t;a0++)
        {
            int n=in.nextInt();
            int [][] m=new int [n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    m[i][j]=in.nextInt();
                }
            }
            for(int i=n-2;i>=0;i--)
            {
                for(int j=0;j<i+1;j++)
                {
                    m[i][j]=m[i][j]+Math.max(m[i+1][j],m[i+1][j+1]);
                }
            }
            System.out.println(m[0][0]);
        }
    }
}
