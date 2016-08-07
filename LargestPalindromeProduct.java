/*A palindromic number reads the same both ways. The smallest 6 digit palindrome made from the 
product of two 3-digit numbers is 101101=143*707
Find the largest palindrome made from the product of two 3-digit numbers which is less than*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
        
      for(int i=0;i<x;i++)
          {
            int l=sc.nextInt();
            int szukana=0;
             for(int g=0;g<=999;g++)
                 {
                  for(int h=0;h<=999;h++)
                      { int pom=h*g;
                        if(pal(pom)&&(pom)<l&&pom>szukana){szukana=g*h;}
                  }
             }
          System.out.println(szukana);
      }
    }
    
    public static boolean pal(int x)
        {
          int y=x;
          int sz=0;
          while(y!=0){
              sz=sz*10+y%10;
              y=y/10;
          }
        if(sz==x){return true;}
        else {return false;}
    }
}
