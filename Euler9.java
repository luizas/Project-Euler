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
          int sz=-1;
          il:for(int a=1;a<12;a++)
               {for(int b=1;b<12;b++)
               {
                         if(a+b+(p-(a+b))==p&&(p-(a+b))>0){
                           if(a*a+b*b==(p-(a+b))*(p-(a+b))||a*a+(p-(a+b))*(p-(a+b))==b*b||b*b+(p-(a+b))*(p-(a+b))==a*a){sz=a*b*(p-(a+b));break il;}
                             
                             
                       }}}
       System.out.println(sz);
    }
}
}
