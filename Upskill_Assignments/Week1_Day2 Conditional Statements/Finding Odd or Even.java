/*

Finding Odd or Even

Write a program to find whether a given integer is an odd or even number.

 Input and Output Format:

Input consists of a single integer.

The output consists of a single line, which represents whether it is an even number or not.

Sample Input 1:

5

Sample Output 1:

5 is an odd number

 Sample Input 2:

88

Sample Output 2:

88 is an even number

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a%2==0)
            {
                System.out.println(a+" is an even number");
            }
            else
            {
                System.out.println(a+" is an odd number");
            }
     }
}

