/*

Using contains() and trim() method
 
Sunil has finished most of his application for the fair, it's time to focus on minor details that went wrong during a test run of his application in this module. Accidentally some gibberish text with leading and trailing got copied to the clipboard and got pasted in some of the text documents. But, still. He has the gibberish text with him, he can manually load each document, and find the text and delete it. Think it will take ages, no he can think of a time saver. He can use his programming skills, he can load each document in a program and find in which files the text got copied. Even though, he feels difficult to identify it. So let him.

write a program to find whether the gibberish text is present in the string. Assume text of the document is given as the input to the program.

Create a driver class called Main. In the Main method, obtain the inputs from the console and prompt whether the gibberish text is present in the main text.

Problem Constraints:

Use contains() and trim()

Input and Output format:
The first line of the input consists of the text of the document.
The second line of the input consists of a string that has to be found in the given text.

Note: All text in bold corresponds to the input and rest corresponds to the output.

Sample Input and output 1:

Enter the text from the document
One fine morning, a minister from Emperor Akbar's court had gathered in the assembly hall. He informed the Emperor that all his valuables had been stolen by a thief the previous night.
Enter the string to be found in the data
    stolen   
String is found in the document

Sample Input and output 2:

Enter the text from the document
One fine morning, a minister from Emperor Akbar's court had gathered in the assembly hall. He informed the Emperor that all his valuables had been stolen by a thief the previous night.
Enter the string to be found in the data
    Birbal
String is not found in the document

*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text from the document");
            String s = sc.nextLine();
            System.out.println("Enter the string to be found in the data");
            String a = sc.nextLine();
            a = a.trim();
            if(s.contains(a))
            {
                System.out.print("String is found in the document");
            }
            else
            {
                System.out.print("String is not found in the document");
            }
        
     }
}
