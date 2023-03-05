/*

IPL Pattern 

 

Write a program to generate the given pattern.

CCCCCC

CCSSCC

SSSSSS

SSSSSS

KKSSKK

KKKKKK

Input and Output Format:

Input consists of a single integer, n. n is always an even integer. n>=6.
Refer sample input and output for formatting specifications.

 

Sample Input 1:

6

 

Sample Output 1:

CCCCCC

CCSSCC

SSSSSS

SSSSSS

KKSSKK

KKKKKK

Sample Input 2:
8

Sample Output 2:
CCCCCCCC
CCCSSCCC
CCSSSSCC
SSSSSSSS
SSSSSSSS
KKSSSSKK
KKKSSKKK
KKKKKKKK

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n/2-1;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(j>n/2-i-1 && j<n/2+i)
                    {
                        System.out.print("S");
                    }
                    else{
                        System.out.print("C");
                    }
                }
                System.out.println();
            }
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("S");
                }
                System.out.println();
            }
            for(int i=n/2-2;i>=0;i--)
            {
                for(int j =0;j<n;j++)
                {
                    if(j>n/2-i-1 && j<n/2+i)
                    {
                        System.out.print("S");
                    }
                    else{
                        System.out.print("K");
                    }
                }
                System.out.println();
            }
        
     }
}
