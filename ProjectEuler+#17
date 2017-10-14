import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int a0=0;a0<n;a0++)
        {
            long l=in.nextLong();
            if(l!=0){
            String s="";
            int a=0;
            while(l>0)
            {
                long q=l%1000;
                
                String t=tr(q);
                if(a==0)
                {
                    s=t;
                }
                if(a==1&&q!=0)
                {
                    s=t+" "+"Thousand "+s;
                }
                if(a==2&&q!=0)
                {
                    s=t+" Million "+s;
                }
                if(a==3&&q!=0)
                {
                    s=t+" Billion "+s;
                }
                if(a==4)
                {
                    s="One Trillion";
                }
                l=l/1000;
                a++;
                
            }
            System.out.println(s);
        }
        else
        {
            System.out.println("Zero");
        }}
         
    }
    public static String tr(long a)
    {
        if(a==0)
        {
            return "";
        }
        if(a%100==0)
        {
            return tr(a/100)+" "+"Hundred";
        }
        if(a/100>=1)
        {
            return tr(a/100)+" "+"Hundred"+" "+tr(a%100);
        }
        if(a==0)
        {
            return "";
        }
        if(a/10==2&&a%10!=0)
        {
            return "Twenty"+" "+tr(a%10);
        }
        if(a==20)
        {
            return "Twenty";
        }
        if(a/10==3&&a%10!=0)
        {
            return "Thirty"+" "+tr(a%10);
        }
        if(a==30)
        {
            return "Thirty";
        }
        if(a/10==4&&a%10!=0)
        {
            return "Forty"+" "+tr(a%10);
        }
        if(a==40)
        {
            return "Forty";
        }
        if(a/10==5&&a%10!=0)
        {
            return "Fifty"+" "+tr(a%10);
        }
        if(a==50)
        {
            return "Fifty";
        }
        if(a/10==6&&a%10!=0)
        {
            return "Sixty"+" "+tr(a%10);
        }
        if(a==60)
        {
            return "Sixty";
        }
        if(a/10==7&&a%10!=0)
        {
            return "Seventy"+" "+tr(a%10);
        }
        if(a==70)
        {
            return "Seventy";
        }
        if(a/10==8&&a%10!=0)
        {
            return "Eighty"+" "+tr(a%10);
        }
        if(a==80)
        {
            return "Eighty";
        }
        if(a/10==9&&a%10!=0)
        {
            return "Ninety"+" "+tr(a%10);
        }
         if(a==90)
        {
            return "Ninety";
        }
        if(a==1)
        {
            return "One";
        }
        if(a==2)
        {
            return "Two";
        }
        if(a==3)
        {
            return "Three";
        }
        if(a==4)
        {
            return "Four";
        }
        if(a==5)
        {
            return "Five";
        }
        if(a==6)
        {
            return "Six";
        }
        if(a==7)
        {
            return "Seven";
        }
        if(a==8)
        {
            return "Eight";
        }
        if(a==9)
        {
            return "Nine";
        }
        if(a==10)
        {
            return "Ten";
        }
        if(a==11)
        {
            return "Eleven";
        }
        if(a==12)
        {
            return "Twelve";
        }
        if(a==13)
        {
            return "Thirteen";
        }
        if(a==14)
        {
            return "Forteen";
        }
        if(a==15)
        {
            return "Fifteen";
        }
        if(a==16)
        {
            return "Sixteen";
        }
        if(a==17)
        {
            return "Seventeen";
        }
        if(a==18)
        {
            return "Eighteen";
        }
        if(a==19)
        {
            return "Nineteen";
        }
        
        return "";
    }
}
