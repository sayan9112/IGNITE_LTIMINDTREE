/*

Flag Pattern 

Write a program to generate the flag pattern given in the sample output. 
 
Input and Output Format:
Input consists of a single integer, n. Assume that “n” should be an odd number.
The number of rows and columns is equal.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
3
Sample Output 1:
 
~ ~ ~ 
~ * ~ 
~ ~ ~
 
Sample Input 2:
7
Sample Output 2:
 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ *  ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = (n+1)/2;
            for(int i= 1;i<=n;i++)
            {
                for(int j= 1 ;j<=n;j++)
                {
                    if(i == j && j == a)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("~");
                    }
                }
                System.out.println("\n");
            }
        
     }
}
