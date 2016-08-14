/**
 * @author Luiza
 * @version 1.00 2016/8/14
 * Special Pythagorean triplet
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler9 {


    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int ile= sc.nextInt();
    for (int i=0;i<ile;i++)
        {
          int p=sc.nextInt();
          int sz=0;
          il:for(int a=1;a<12;a++)
               {for(int b=1;b<12;b++)
               {
                   for(int c=1;c<12;c++)
                       {  if(a+b+c==p){
                           if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){sz=a*b*c;break il;}
                             else {sz=-1;}
                             
                       }}}}
       System.out.println(sz);
    }
}
}
