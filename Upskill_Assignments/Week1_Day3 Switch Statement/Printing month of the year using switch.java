/*

Printing month of the year using switch

Write a program to get the month as integer and year as integer from user and display what month it corresponds and number of days in that month .

INPUT AND OUTPUT CONSTRAINTS :
 Input consists of 2 integers month and year.
 Output consists of name of month and number of days. Output "Invalid Month" if it is not valid.

SAMPLE INPUT AND OUTPUT 1:
Enter the month:
2
Enter the year:
2000
February of 2000 has 29 days.

SAMPLE INPUT AND OUTPUT 2:
Enter the month:
8
Enter the year:
1992
August of 1992 has 31 days.

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        int n = sc.nextInt();
        System.out.println("Enter the year:");
        int y = sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.print("January of "+y+" has 31 days.");
                break;

            case 2:
                if((y%4==0 && y%100!=0 ) || (y%4==0 && y%100==0 && y%400 ==0))
                      System.out.print("February of "+y+" has 29 days.");
                else
                      System.out.print("February of "+y+" has 28 days.");
                break;

               case 3:
                System.out.print("March of "+y+" has 31 days.");
                break;  

                 case 4:
                System.out.print("April of "+y+" has 30 days.");
                break;

                 case 5:
                System.out.print("May of "+y+" has 31 days.");
                break;

                 case 6:
                System.out.print("June of "+y+" has 30 days.");
                break;

                 case 7:
                System.out.print("July of "+y+" has 31 days.");
                break;

                 case 8:
                System.out.print("August of "+y+" has 31 days.");
                break;

                 case 9:
                System.out.print("September of "+y+" has 30 days.");
                break;

                 case 10:
                System.out.print("October of "+y+" has 31 days.");
                break;

                 case 11:
                System.out.print("November of "+y+" has 30 days.");
                break;

                 case 12:
                System.out.print("December of "+y+" has 31 days.");
                break;

                default:
                System.out.println("Invalid Month");
        }
        
     }
}

