import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(largestPrime(n));
        }
    }
    public static long largestPrime(long n){
      long ans = 0;
      while(n % 2 == 0){
          n/=2;
          ans = Math.max(ans, 2);
      }
      for(long i = 3; i*i <= n; i++){
         while(n%i == 0){
             n /= i;
             ans = Math.max(ans, i);
        }
      }
      if(n > 1) ans = Math.max(n, ans); 
      return ans;
    }
}
