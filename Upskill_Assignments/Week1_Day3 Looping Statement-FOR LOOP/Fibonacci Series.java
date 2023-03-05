/*

Fibonacci Series

Write a program to generate the Fibonacci series up to n terms.

Fibonacci series start with 0, 1, 1, 2, 3, ..…

Input Format:

Input consists of a single integer, n.

Output Format:

The output consists of a Fibonacci series.

Sample Input and Output 1:
[All text in bold corresponds to input and the rest corresponds to output.]
Enter the range:
7
Fibonacci series:
0
1
1
2
3
5
8


Sample Input and Output 2:
[All text in bold corresponds to input and the rest corresponds to output.]
Enter the range:
10
Fibonacci series:
0
1
1
2
3
5
8
13
21

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the range:");
            int n = sc.nextInt();
            System.out.println("Fibonacci series:");
            int a =0 , b=1, c =1;
            System.out.println(a);
             System.out.println(b);
             for(int i=2;i<n;i++)
             {
                 System.out.println(c+"\n");
                 a =b;
                 b = c;
                 c= a+b;
             }
        
     }
}
