/*

Reversing a number

Write a program to reverse the digits of a number.

 

Input Format :

Input consists of a positive integer value.

Output Format :

The output consists of the reverse of the given number.

Refer to Sample Input and Output for further details.

[All text in bold corresponds to input and the rest corresponds to output.]

 

Sample Input and Output 1 :

Enter the number :
5642
Reverse of the number is 2465
 

Sample Input and Output 2 :

Enter the number :
1000
Reverse of the number is 1

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
           
            System.out.println("Enter the number :");
             int n = sc.nextInt();
             int w = 0;
             while(n>0)
             {
                 int x = n%10;
                 w = w*10 + x;
                 n = n/10;
             }
            System.out.println("Reverse of the number is "+w);
     }
}
