import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int pr=0;
         int a=0;
                int b=0;
                int c=0;
        int d=0;
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
               
                if(i+3<20)
                    a=grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];              
                if(j+3<20)
                    b=grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                if(i+3<20&&j+3<20)
                    c=grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
                if (i < 17 && j > 2){
                    d = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];}
               int q=max(max(a,b),max(c,d)); 
                if(pr<q)
                {
                    pr=q;
                }
            }
        }
        
        System.out.println(pr);
    }
    public static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
}
