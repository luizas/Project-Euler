/*Each new term in the Fibonacci sequence is generated 
by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
By considering the terms in the Fibonacci sequence whose values do not exceed N, 
find the sum of the even-valued terms. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonacci {

    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
        
      for(int i=0;i<x; i++)
          {
            int y=sc.nextInt();
            int sum=0;
            int p=1;
            while(fib(p)<y)
                {
                  if(fib(p)%2==0){sum=sum+fib(p);}
                     p++;
               }
          System.out.println(sum);
      }
    }
    public static int fib(int l)
        { 
          if(l==1||l==0||l==2)return l;
          else return (fib(l-1)+fib(l-2));
    }
}
