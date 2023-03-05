/*

CHARACTER – UPPER OR LOWER

Write a  program that accepts a character as input and checks whether it is an uppercase letter or lowercase letter or neither.

 

Input Format:

Input consists of a single character.

Output Format:

Output consists of a single line. Refer sample output for the format.

 

Sample Input 1 :

c

Sample Output 1 :

c is lowercase letter

 

Sample Input 2:

A

Sample Output 2:

A is uppercase letter

 

Sample Input 3:

5

Sample Output 2:

5 is neither an uppercase or lowercase letter

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            char c= sc.next().charAt(0);
            if(c >=65 && c<=90)
            {
                System.out.println(c+" is uppercase letter");
            }
            else if(c>=97 && c<=122)
            {
                System.out.println(c+" is lowercase letter");
            }
           else{
               System.out.println(c+" is neither an uppercase or lowercase letter");
           }
     }
}
