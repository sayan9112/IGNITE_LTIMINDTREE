/*

Checking Divisibility By 7 and 3

Write a program to find whether a given number is divisible by both 7 and 3.

Input Format:

Input consists of a single integer.

Output Format:

Output consists of a single line. Refer sample output for the format.

Sample Input 1:

21

Sample Output 1 :

21 is divisible by both 7 and 3

Sample Input 2:

18

Sample Output 2:

18 is not divisible by both 7 and 3

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a%7==0 && a%3==0)
            {
                System.out.println(a+" is divisible by both 7 and 3");

            }
            else
            {
                 System.out.println(a+" is not divisible by both 7 and 3");
            }
        
     }
}
