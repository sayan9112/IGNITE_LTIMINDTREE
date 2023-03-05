/*

Grade Calculation

Write a program to determine the grade of the student in a particular subject. Refer to the table given below for grade details.

            Marks scored	     Grade

            100               	S
            [90,100)          	A
            [80,90)           	B
            [70,80)           	C
            [60,70)           	D
            [50,60)           	E
            <50               	F

The interval [a,b] includes all numbers greater than or equal to a and less than b.

 

Input and Output Format:
Input consists of a single integer that corresponds to the marks scored by the student.

Print "Invalid Input" if it is not in the range 0 to 100.

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

 

Sample Input and Output 1:
Enter the marks

85

The student obtained a B grade

Sample Input and Output 2:
Enter the marks

850

Invalid Input

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        //fill your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        int a = sc.nextInt();
        if(a==100)
        {
            System.out.println("The student obtained a S grade");
        }
        else if(a>=90 && a<100)
        {
            System.out.println("The student obtained a A grade");
        }
        else if(a>=80 && a<90)
        {
            System.out.println("The student obtained a B grade");
        }
        else if(a>=70 && a<80)
        {
            System.out.println("The student obtained a C grade");
        }
        else if(a>=60 && a<70)
        {
            System.out.println("The student obtained a D grade");
        }
        else if(a>=50 && a<60)
        {
            System.out.println("The student obtained a E grade");
        }
        else if(a>=0 && a<50)
        {
            System.out.println("The student obtained a F grade");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

}
