/*

String Processing

 

Given a string, write a program to trim all leading and trailing spaces and convert all words in the string except the first word to Upper Case.

 

Input Format:

 

Input consists of a string with leading and trailing spaces.

 

Output Format:

 

Displays the given string by removing all leading and trailing spaces and convert all words in the string except the first word to Upper Case.

Refer Sample Input and Output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

 

Sample Input and Output:

 

Enter the input string

         Amphisoft Technologies

The processed string is Amphisoft TECHNOLOGIES

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string");
        String input = scanner.nextLine();
        input = input.trim();
        String[] words = input.split("\\s+");
        StringBuilder outputBuilder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++)
         {
            outputBuilder.append(" ");
            outputBuilder.append(words[i].toUpperCase());
        }
        String output = outputBuilder.toString();  
        System.out.println("The processed string is " + output);
    }
}







