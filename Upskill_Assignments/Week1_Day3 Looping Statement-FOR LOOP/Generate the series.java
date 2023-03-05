/*

Generate the series


Write a program to generate the below series:
3,7,15,31,63,...

Input Format:

Input consists of a single integer which corresponds to n.

Output Format:

Output consists of the terms in the series separated by a blank space.

Sample Input 1:

6

Sample Output 1:

3 7 15 31 63 127


Sample Input 2:
9

Sample Output 2:
3 7 15 31 63 127 255 511 1023

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        //fill your code here
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int x= 3;
        for(int i=1;i<=a;i++)
        {
           System.out.println(x);
           x= (x*2)+1;
        }
    }

}
