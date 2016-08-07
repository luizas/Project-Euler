//Multiples of 3 and 5

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiplesof3and5 {

    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
        int y=x.nextInt();
        
        for(int i=0;i<y;i++)
            {
              int sz=x.nextInt();
              int sum=0;
              for(int j=1;j<sz;j++)
                  {
                  if (j%3==0||j%5==0){
                      sum=sum+j;
                  }
                  
              }
                System.out.println(sum);
        }
    }
}
