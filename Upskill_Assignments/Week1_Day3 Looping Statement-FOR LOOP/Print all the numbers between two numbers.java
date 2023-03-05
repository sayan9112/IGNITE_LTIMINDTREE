/*

Write a program to print all the numbers between a and b (a and b inclusive) using a for a loop.

 

Input Format:


Input consists of 2 integers. The first integer corresponds to a and the second integer corresponds to b. Assume a>=b.

 

Output Format:


Refer to Sample Input and Output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output]

Sample Input and Output:


Enter the value of a
4
Enter the value of b
10

4
5
6
7
8
9
10

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            for(int i=a;i<=b;i++)
            {
                System.out.println(i+"\n");
            }
        
     }
}
