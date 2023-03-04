/*


Removing multiple spaces

Write a program to remove multiple spaces in a string.

 

Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output :

Enter the string

Java             is                           an                 Object Oriented Prog Language

The processed string is Java is an Object Oriented Prog Language

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the string");
            String s = sc.nextLine();
            System.out.println("The processed string is "+s.replaceAll("\\s+"," ").trim());
        
     }
}
