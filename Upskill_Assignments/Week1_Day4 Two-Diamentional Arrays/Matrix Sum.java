/*

Matrix Sum

Write a  program to find the sum of the elements in the matrix.

 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

Output Format:

Refer sample output for details.

 

Sample Input 1:

3

2

4 5

6 9

0 3

Sample Output 1:

The sum of the elements in the matrix is 27

*/


import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        int sum =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
            }
        }
        System.out.print("The sum of the elements in the matrix is "+sum);
    }
}
