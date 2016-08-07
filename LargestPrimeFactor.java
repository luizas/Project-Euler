/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of a given number N?*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPrimeFactor {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int x= sc.nextInt();
        
       for(int i=0;i<x;i++)
           {
            int y=sc.nextInt();
            int lar=0;
           
            for(int j=y;y>0;j--)
                {
                  if(prime(j)&&y%j==0){ lar=j;break;}
                }
           System.out.println(lar);
            
       }
    }
    public static boolean prime(int k)
        {
         for(int z=2;z<k;z++){
             if(k%z==0){return false;}}
                        
                        return true;
    
    }}
