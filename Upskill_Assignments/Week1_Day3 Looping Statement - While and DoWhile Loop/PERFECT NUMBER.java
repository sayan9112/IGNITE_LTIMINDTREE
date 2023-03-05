/*

PERFECT NUMBER


Write a  program to find whether a given number is a perfect number or not.

A perfect number is a number in which the sum of its proper divisors is equal to the number itself. Proper divisors of a number are all divisors of a number excluding itself.


Input Format:

Input consists of a single integer.


Output Format:


Output consists of a single line. Refer sample output for details.


Sample Input 1:
6
Sample Output 1:
Perfect number


Sample Input 2:
12
Sample Output 2:
Not a perfect number

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            int i=2,sum=1;;
            while(i<n)
            {
                if(n%i==0)
                {
                    sum = sum +i;
                }
                i++;
            } 
            if(sum==n)
            {
                System.out.println("Perfect number");
            }       
            else
            {
                System.out.println("Not a perfect number");
            }
     }
}
