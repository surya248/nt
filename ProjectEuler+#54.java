import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int a0=0;a0<t;a0++)
        {
            String [] p1=new String [5];
            for(int i=0;i<5;i++)
            {
                p1[i]=in.next();
            }
            String [] p2=new String [5];
            for(int i=0;i<5;i++)
            {
                p2[i]=in.next();
            }
           int [][] pl1=card(p1);
            int [][] pl2=card(p2);
            if(pl1[0][0]<pl2[0][0])
            {
                System.out.println("Player 2");
            }
            else if(pl1[0][0]>pl2[0][0])
            {
                System.out.println("Player 1");
            }
            else
            {
                java.util.Arrays.sort(pl1, java.util.Comparator.comparingInt(a -> a[1]));
                java.util.Arrays.sort(pl2, java.util.Comparator.comparingInt(a -> a[1]));
                for(int i=5;i>=0;i--)
                {
                    if(pl1[i][0]>pl2[i][0])
                    {
                        System.out.println("Player 1");
                        break;
                    }
                    if(pl1[i][0]<pl2[i][0])
                    {
                        System.out.println("Player 2");
                        break;
                    }
                }
            }
        }
    }
    public static int [][] card(String [] a)
    {
        int [][] ans=new int [6][2];
        int d=0;
        int s=0;
        int c=0;
        int h=0;
        int [] v=new int [15];
        int ten=0;
        for(int i=0;i<5;i++)
        {
            char w=a[i].charAt(1);
            if(w=='H')
            {
                h++;
            }
            if(w=='C')
            {
                c++;
            }
            if(w=='D')
            {
                d++;
            }
            if(w=='S')
            {
                s++;
            }
        }
        for(int i=0;i<5;i++)
        {
            char w=a[i].charAt(0);
            if(w=='T')
            {
                v[10]++;
            }
            else if(w=='A')
            {
                v[14]++;
            }
            else if(w=='K')
            {
                v[13]++;
            }
            else if(w=='Q')
            {
                v[12]++;
            }
            else if(w=='J')
            {
                v[11]++;
            }
            else
            {

                int x = Character.getNumericValue(w);
                v[x]++;
            }
        }
        int y=1;
        for(int i=2;i<15;i++)
        {
            if(v[i]!=0)
            {
                ans[y][0]=i;
                ans[y][1]=v[i];
                y++;
            }
        }
        if(h==5||d==5||c==5||s==5)
        {
            if(v[10]==1&&v[11]==1&&v[12]==1&&v[13]==1&&v[14]==1)
            {
                ans[0][0]=10;
                return ans;
            }
            for(int i=2;i<10;i++)
            {
                if(v[i]==1&&v[i+1]==1&&v[i+2]==1&&v[i+3]==1&&v[i+4]==1||v[2]==1&&v[3]==1&&v[4]==1&&v[5]==1&&v[14]==1)
                {
                    ans[0][0]=9;
                    return ans;
                }
            }
            ans[0][0]=6;
            return ans;
        }
        for(int i=2;i<=14;i++)
        {
            if(v[i]==4)
            {
                ans[0][0]=7;
                return ans;
            }
            if(v[i]==3)
            {
                for(int j=2;j<=14;j++)
                {
                    if(v[j]==2&&i!=j)
                    {
                        ans[0][0]=8;
                        return ans;
                    }
                }
                ans[0][0]=4;
                return ans;
            }
        }
        for(int i=2;i<=10;i++)
            {
                if(v[i]==1&&v[i+1]==1&&v[i+2]==1&&v[i+3]==1&&v[i+4]==1)
                {
                    ans[0][0]=5;
                    return ans;
                }
            }
         if(v[2]==1&&v[3]==1&&v[4]==1&&v[5]==1&&v[14]==1)
        {
             ans[0][0]=5;
             return ans;
        }
        for(int i=2;i<=14;i++)
        {
            if(v[i]==2)
            {
                for(int j=2;j<=14;j++)
                {
                    if(v[j]==2&&j!=i)
                    {
                        ans[0][0]=3;
                        return ans;
                    }
                }
                ans[0][0]=2;
                return ans;
            }
        }
        ans[0][0]=1;
        return ans;        
    }
}
