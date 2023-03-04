/*

Adjacent characters

 

Given a string, write a program to compute a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

 

Input and Output Format:

 

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output 1:

 

Enter the string

hello

The processed string is hel*lo


Sample Input and Output 2:

 

Enter the string

marvellouss

The processed string is marvel*lous*s

 */

import java.util.*;
class Main {
    public static void main(String[] args) {
 
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the string");
            String s = sc.nextLine();
            String c = "";
            int i=0;
           while(true)
            {    
                 c = c + s.charAt(i);
                  if(i== s.length()-1)
                          break;
                if(s.charAt(i)==s.charAt(i+1))
                {
                    c = c +"*";
                }
                i++;
            }
            System.out.println("The processed string is "+c);
        
     }
}

