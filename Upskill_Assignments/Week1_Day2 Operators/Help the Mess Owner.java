/*

Help the Mess Owner


Students of ABC college are taking their lunch in the mess near the college gate as the prices are reasonable and the food is also tasty. First-year students developed an application to help the stationery shopkeeper. Mess owner also requested students to develop an application for him. The mess owner was ready to purchase a second-hand computer.

Students very well knew that the same application may not help the mess owner as his requirements and sales pattern is completely different. Most of the time, students purchased the food parcels in bulk and all of the items were of the same cost. They quickly concluded that the mess owner's job would be easier if they could write a program that asks for the cost of the item and the number of items purchased and prints the total cost of the items purchased.

Write a program to get the cost of the item and the number of items purchased and print the total cost of the items purchased.

 

Input Format:

Input consists of 2 integers. The first integer corresponds to the cost of the item and the second integer corresponds to the number of items purchased.

 

Output Format:

Refer sample input and output for formatting specifications.

 

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

Cost of item:

15

Number of items:

7

Total cost is Rs.105

*/

import java.util.*;
public class Main{
    public static void main(String[] args){          
           //Fill your code
           Scanner sc = new Scanner(System.in);
           System.out.println("Cost of item:");
           int a = sc.nextInt();
           System.out.println("Number of items:");
           int b = sc.nextInt();
           System.out.println("Total cost is Rs."+(a*b));
    }
}
