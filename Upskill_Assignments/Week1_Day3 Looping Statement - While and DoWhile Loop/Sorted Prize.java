/*

Sorted Prize


A customer in the Personalised Gifts Store is awarded a prize when their bill number is a 3-digit number and all the 3 digits are in sorted order. (Examples ---> 379, 256, 973, 652, 225, 522 ...]

                                                                 
Help Gita in identifying the prize winners.

 

Input Format:

Input consists of a number which corresponds to the bill number.

Output Format:
The output consists of a string that is either 'yes' or 'no'. The output is yes when the customer receives the prize and is no otherwise.

 

Sample Input 1:

565

Sample Output 1:

no


Sample Input 2:

620

Sample Output 2:

yes


Sample Input 3:

66

Sample Output 3:

no

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        //fill your code here
    Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m =n,c=0,y=0;
        boolean x = false;
        int a= n%10;
        n= n/10;
        while(m>0)
            {
               m = m/10;
               c++;
            }
            if(c!=3 || n ==0)
            {
                x= true;
            }
        while(n>0)
        {   
            if(a<n%10 )
            {  
                if(y!=0)
                {
                    x= true;
                    break;
                } 
                while(n>0)
                {
                    if(a>n%10)
                    {
                        x= true;
                        break;
                    }
                    a =n%10;
                    n = n/10;
                }   
            }
            if(a!=n%10)
            {
                y=1;
            }
            a= n%10;
            n = n/10;
            
        }
        if(x)
        {
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}

