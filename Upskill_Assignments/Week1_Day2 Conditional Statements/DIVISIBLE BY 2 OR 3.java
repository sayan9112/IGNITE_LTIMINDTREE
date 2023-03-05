/*

DIVISIBLE BY 2 OR 3

Write a program that prints "yes" if the given integer is divisible by 2 or 3 and "no" otherwise.

 

Input Format:

Input consists of a single integer.

 

Output Format:

The output consists of a single line. Refer sample output for the format.

 

Sample Input 1 :

21

 

Sample Output 1 :

yes

 

Sample Input 2:

19

 

Sample Output 2:

no

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a%2==0 || a %3==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        
     }
}
