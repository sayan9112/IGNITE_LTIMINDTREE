/*

String Operations-Length,Uppercase,Concat & Compare

Write a program to perform the following operations on strings.

Finding the length of the string

Converting to uppercase

Finding the concatenation of 2 strings

To compare 2 strings --- The function returns 0 if the 2 strings are the same, returns -1 if the first string is less than the second string, and returns 1 if the first string is greater than the second string.

 

Input Format:

Input consists of 2 strings.

Output Format:

Please refer to the sample output for formatting details.

 

Sample Input 1:

were

apple

Sample Output 1:

The length of the first string is 4

The length of the second string is 5

The uppercase of the first string is WERE

The uppercase of the second string is APPLE

The concatenated string is wereapple

apple appears before were

 

Sample Input 2:

apple

were

Sample Output 2:

The length of the first string is 5

The length of the second string is 4

The uppercase of the first string is APPLE

The uppercase of the second string is WERE

The concatenated string is applewere

apple appears before were

 

Sample Input 3:

be

bet

Sample Output 3:

The length of the first string is 2

The length of the second string is 3

The uppercase of the first string is BE

The uppercase of the second string is BET

The concatenated string is bebet

be appears before the bet

 

Sample Input 4:

be

be

Sample Output 4:

The length of the first string is 2

The length of the second string is 2

The uppercase of the first string is BE

The uppercase of the second string is BE

The concatenated string is bebe

Both the input strings are the same

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println("The length of the first string is "+a.length());
            System.out.println("The length of the second string is "+b.length());
            System.out.println("The uppercase of the first string is "+a.toUpperCase());
            System.out.println("The uppercase of the second string is "+b.toUpperCase());
            System.out.println("The concatenated string is "+a.concat(b));
            if(a.compareTo(b)<0)
            { 
                 System.out.print(a+" appears before "+b);
            }
            else if(a.compareTo(b)>0)
                 System.out.print(b+" appears before "+a);
          else
                 System.out.print("Both the input strings are the same");
     }
}
