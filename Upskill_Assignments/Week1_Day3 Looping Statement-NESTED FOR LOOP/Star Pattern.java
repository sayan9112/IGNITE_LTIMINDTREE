/*

Star Pattern

Write a program to generate a pattern of stars.


Input and Output Format:

Input consists of a single integer that corresponds to n, the number of rows.

Refer sample input and output for formatting specifications.


[All text in bold corresponds to input and the rest corresponds to the output.]

Sample Input and Output 1:

5

*

**

***

****

*****

 

Sample Input and Output 2:

3

*

**

***

*/

import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{ 
    
//      Fill your code

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          for(int j= 1; j<=i;j++)
          {
              System.out.print("*");
          }
          System.out.println("\n");
      }

    }
}
