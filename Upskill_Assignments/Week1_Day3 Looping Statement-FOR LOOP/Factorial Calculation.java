/*

Factorial Calculation

Write a program to find the factorial of a given number.

Input Format:

Input consists of a single integer, n.

Output Format:

Output consists of a single integer which corresponds to n!

Sample Input 1:

4

Sample Output 1:

24

 

Sample Input 2:

6

Sample Output 2:

720

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int a  = sc.nextInt();
            int b =1;
            for(int i=a;i>=1;i--)
            {
                 b = i*b;
            }
            System.out.println(b);
        
     }
}
