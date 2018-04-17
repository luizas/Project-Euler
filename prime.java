// 10001st prime test

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;/wowwow

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean[]tab=new boolean[100000];
        
        for(int i=0;i<x;i++)
            {
              int sz=sc.nextInt();
              
              for(int j=2;j<100000;j++)
                  {
                    tab[j]=true;
              }
            for(int j1=2;j1<100000;j1++)
                  { if (tab[j1]==true)
                      {for(int z=2*j1;z<100000;z=z+j1)
                      {
                          tab[z]=false;
                      }
                   }
               
                    
              }
              int ktora=0;
              int count=0;
            
              for(int j=2;j<100000;j++)
                  {
                  if(tab[j]==true&&count<sz){count++;ktora=j;}
                    
              }
            System.out.println(ktora);
             
        }
    }
}
