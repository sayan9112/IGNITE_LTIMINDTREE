/*

String API : endsWith() : Illustration


Write a program to illustrate the use of the method endsWith() defined in the string API.

 

Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output 1:

Enter the string

Technology

Enter the end string

Tech

"Technology" does not end with "Tech"

 

Sample Input and Output 2:

Enter the string

John

Enter the end string

on

"Jhon" ends with "on"

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // fill your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the end string");
        String a = sc.nextLine();
        if(s.endsWith(a))
        {
            System.out.println((char)34 +s+(char)34+" ends with "+(char)34+a+(char)34);
        }
        else
        {
            System.out.println((char)34 +s+(char)34+" does not end with "+(char)34+a+(char)34);
        }
    }
}

