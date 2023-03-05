/*

Flag Pattern - ITALY
 
Write a program to generate the Italy country flag pattern. In Italy flag, 
Green color should be represented by “(” symbol. 
White color should be represented by “#” symbol.
Red color should be represented by “)” symbol.
 


 
Input and Output Format:
 
Input consists of a single integer, n. Assume that “n>=4” and should be an even number.
The width to length ratio of the flag is 2:3.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
 
4
 
Sample Output 1:
 
( ( # # ) ) 
( ( # # ) ) 
( ( # # ) ) 
( ( # # ) ) 
 
Sample Input 2:
 
18
 
Sample Output 2:
 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) )

*/

import java.util.*;
class Main {
    public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int n= sc.nextInt();
            int w = n*3/2;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<w;j++)
                {
                    if(j<n/2)
                    {
                        System.out.print("(");
                    }
                    else if(j<n)
                    {
                        System.out.print("#");
                    }
                    else{
                        System.out.print(")");
                    }
                }
                System.out.println();
            }
     }
}
