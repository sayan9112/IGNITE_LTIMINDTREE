/*

String API : startsWith() : Illustration


Write a program to illustrate the use of the method startsWith() defined in the string API.

 

Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output 1:

Enter the string

Technology

Enter the start string

Logic

"Technology" does not start with "Logic"

 

Sample Input and Output 2:

Enter the string

Technology

Enter the start string

Tech

"Technology" starts with "Tech"

 */

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        //Your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the start string");
        String a = sc.nextLine();
        if(s.startsWith(a))
        {
            System.out.println((char)34 +s+(char)34+" starts with "+(char)34+a+(char)34);
        }
        else
        {
            System.out.println((char)34 +s+(char)34+" does not start with "+(char)34+a+(char)34);
        }
    }
}
