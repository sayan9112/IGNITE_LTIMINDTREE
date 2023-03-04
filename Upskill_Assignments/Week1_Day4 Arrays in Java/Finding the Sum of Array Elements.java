/*

Finding the Sum of Array Elements

Write a program to find the sum of an elements in an array.

Input Format:

Input consists of n+1 integers. The first integer corresponds to ‘n’, the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:

Refer to sample output for details.

Sample Input :

5

2

3

6

8

1

Sample Output :

The sum of the elements in the array is 20

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];

        }
        System.out.println("The sum of the elements in the array is "+sum);

    }

}






