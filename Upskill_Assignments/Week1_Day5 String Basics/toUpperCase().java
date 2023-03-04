/*

toUpperCase()
When we get the usernames for the user in their profiles, some may enter in uppercase, some in lowercase, some in mixed cases. Now we don't want that, we want uniformity in the usernames if we are gonna present a legible report. So let's write a program that converts all the letters of the username into uppercase.

Input Format:
The first line input corresponds to the username.
Refer sample input for formatting specifications.

Output Format:
The output consists of username in UPPERCASE.
Refer sample output for formatting specifications.

[All text in bold corresponds to input and rest corresponds to output]
Sample Input/Output -1 :
Enter the name:
Willam EdilBert
Name:WILLAM EDILBERT

*/

import java.util.*;
public class Main {
    public static void main(String []args){
        //fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String s = sc.nextLine();
        System.out.println("Name:"+s.toUpperCase());
    }
}
