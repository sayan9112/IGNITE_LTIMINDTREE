/*

Odd or even

Write a program to find if the given number is odd or even.Using bitwise AND(&) opeartor.

Input Format:
Input consists of an integer corresponding to the given number.

Output Format:
Output consists of a single line denoting if the given number is odd or even.
Refer sample input and output for formatting specifications.

Sample Input 1 :
Enter any number: 4
Sample Output 1 :
4 is even.

Sample Input 2 :
Enter any number: 5
Sample Output 2 :
5 is odd.

*/

import java.util.*;
public class Main{
    public static void main(String[] args){          
           //Fill your code
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter any number:");
           int a = sc.nextInt();
           int b = a&1;
           if(b==1)
           {
               System.out.println(a+" is odd.");
           }
           else
           {
               System.out.println(a+" is even.");
           }
    }
}
