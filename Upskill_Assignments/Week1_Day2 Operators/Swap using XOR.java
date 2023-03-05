/*

Swap using XOR
Write a program to swap two numbers using bitwise XOR operator.

Input and Output Format:
Input consists of two integers.
Refer sample Input Output for output format.
[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:
Enter the two numbers
3
4
The two values after swapping are
4
3

*/

import java.util.*;
public class Main{
    public static void main(String[] args){          
           //Fill your code
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the two numbers");
           int a = sc.nextInt();
           int b = sc.nextInt();
           a = a^b;
           b  = a^b;
           a = a^b;
           System.out.println("The two values after swapping are\n"+a+"\n"+b);
    }
}
