import java.util.*;
import java.math.*;

 class Solution
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		Scanner in=new Scanner(System.in);
    		int s=in.nextInt();
    		for(int i=1;i<10;i++)
            {
                BigInteger q=BigInteger.valueOf(i);
                for(int j=1;j<s;j++)
                {
                    q=q.multiply(BigInteger.valueOf(i));
                }
                if(digit(q)==s)
                {
                    System.out.println(q);
                }
            }
    	}
        public static int digit(BigInteger n)
        {
            int k=0;
            while(n.compareTo(BigInteger.valueOf(0))>0)
            {
                n=n.divide(BigInteger.valueOf(10));
                k++;
            }
            return k;
        }
    	
    }
     
   
