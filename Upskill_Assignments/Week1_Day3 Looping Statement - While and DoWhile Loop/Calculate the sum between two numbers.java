/*

Calculate the sum between two numbers


Write a program that asks the user to type an integer between 0 and 20 (both included) and write N+17. If someone types a wrong value, he must type another value. Use do-while.

 

Input and Output Format:

Refer sample input and output for formatting specifications.


Sample Input and Output 1:

[All text in bold corresponds to input and the rest corresponds to output]

Type a value between 0 and 20

1

The final value is 18

 

Sample Input and Output 2:

Type a value between 0 and 20

-1

Type a value between 0 and 20

34

Type a value between 0 and 20

5

The final value is 22

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            int n;
            do{
                      System.out.println("Type a value between 0 and 20");
                       n= sc.nextInt();
                  }while(n<0 || n>20);

                  System.out.println("The final value is "+(n+17));
        
     }
}
