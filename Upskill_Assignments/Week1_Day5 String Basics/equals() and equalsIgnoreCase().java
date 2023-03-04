/*

equals() and equalsIgnoreCase()

Sunil has already used equals() method many times. Now he is gonna use it again to check for some mishappenings in his application. In his Assumption, if 2 users are entering addresses in their respective profile and he doesn’t want them to enter the same address by mistake. Help him to do this.

Write a program to show "RED" is the address entered are the same and so on. Refer output format for further details.

Problem Constraints:
Use equals() and equalsIgnoreCase()

Input Format:
The first line input corresponds to the address 1.
The second line input corresponds to the address 2.
Refer to sample input for formatting specifications.

Output Format:
The output consists of a string. It displays
RED - If two addresses are the same.
YELLOW - If two addresses are the same but the mismatch in spaces.
BLUE - If two addresses are the same but the mismatch in cases.
GREEN - If two addresses are different.
Refer to sample output for formatting specifications.

Note: All text in bold corresponds to input and rest corresponds to the output

Sample Input and Output 1 :
Address 1:
Kattoor road,2nd cross Extension,coimbatore,India
Address 2:
kattoor road,2nd cross extension,Coimbatore,india
BLUE

Sample Input/Output -2 :
Address 1:
KR main road,Kashmir,India
Address 2:
KR Street,Kashmir,India
GREEN

*/

import java.util.*;
public class Main {
    public static void main(String []args){
        //fill your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Address 1:");
        String a = sc.nextLine();
        System.out.println("Address 2:");
        String b = sc.nextLine();
        if(a.equals(b))
        {
            System.out.print("RED");
        }
        else if(a.equalsIgnoreCase(b))
        {
            System.out.print("BLUE");
        }
        else if((a.replaceAll(" ","")).equals(b.replaceAll(" ","")))
        {
            System.out.print("YELLOW");
        }
        else{
            System.out.print("GREEN");
        }

    }
}


