/*
String Reversal

 

Write a program to reverse a given string.

 

Input Format:

 

Input consists of a string.

 

Output Format:

 

Output displays the given string in the reverse order.

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

 

Sample Input and Output:

 

Enter a string to reverse

Jhon

Reverse of the string is nhoJ
*/




import java.util.*;
public class Main {
    public static void main(String[] args) {
        // fill your code here
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String s = sc.nextLine();
        String a="";
        for(int i = 0;i<(s.length());i++)
        {
            a = s.charAt(i) +a;
        }
        System.out.println("Reverse of the string is "+a);
    }
}



