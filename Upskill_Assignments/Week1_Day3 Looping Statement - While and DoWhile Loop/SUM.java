/*


SUM

 

Write a program to read in numbers until the number -999 is encountered. The sum of all numbers read until this point should be printed out. (exclude -999 when calculating the sum)

 

Input Format:

Input consists of a list of integers.

 

Output Format:

Output consists of a single line. Refer sample output for details.

 

Sample Input 1:

3

4

5

-2

-999

 

Sample Output 1:

The sum is 10

 

Sample Input 2:

4

4

-999

 

Sample Output 2:

The sum is 8

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // your code here
        Scanner sc= new Scanner(System.in);
        int n , sum=0;
        do{
            n = sc.nextInt();
            if(n!=-999)
            {
                sum  = sum + n;
            }

        }while(n!=-999);
        System.out.println("The sum is "+sum);

    }

}



