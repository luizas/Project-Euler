import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
        
        for(int i=0;i<x;i++)
            {
              int sz=sc.nextInt();
              int sum=0;
              int sum2=0;
              for(int j=1;j<=sz;j++)
                  {
                   sum=sum+ (int)Math.pow(j,2);
              }
            for(int j=1;j<=sz;j++)
                  {
                   sum2=sum2+j;
              }
            System.out.println((int)Math.pow(sum2,2)-sum);
        }
    }
}
