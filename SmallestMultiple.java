/*2520  is the smallest number that can be divided by each of the numbers from to without any remainder.
What is the smallest positive number that is evenly divisible(divisible with no remainder) by all of the numbers from to ?*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SmallestMultiple {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int y=sc.nextInt();
        
        for(int z=0;z<y;z++)
            { int x=sc.nextInt();
        int m=1;
     
        for(int i=1; i<=x;i++)
            {
            m=m*i;
                      }
        int sz=m;
        for(int i=m;i>0;i--)
            {boolean t=true;
            for(int j=1;j<=x;j++)
                {
                if(i%j==0){t=true;}
                else{t=false;break;}
            }
             if(t==true){sz=i;}
        }
        System.out.println(sz);
    }	
    }
}
