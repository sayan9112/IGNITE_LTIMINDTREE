/*

Finding Prime Number

Write a program to find whether a given number is prime or not.


Input Format:

Input consists of a single integer.

Output Format:

The output should display whether the input is “Prime” or “Not prime”.
Refer sample input and output for formatting specifications.


Sample Input 1:
13
Sample Output1:
Prime


Sample Input 2:
33
Sample Output2:
Not prime

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                 b= true;
                 break;
            }
        }
        if(b)
        {
            System.out.print("Not prime");
        }
        else
        {
            System.out.print("Prime");
        }
    }

}
