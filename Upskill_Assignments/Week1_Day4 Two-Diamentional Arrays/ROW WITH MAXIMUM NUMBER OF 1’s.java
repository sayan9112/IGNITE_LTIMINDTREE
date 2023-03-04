/*

ROW WITH MAXIMUM NUMBER OF 1’s
Write a program to find the row with  maximum number of 1s in a given boolean 2D array.

Input Format:
The first line of the input consists of an integer, r that corresponds to the number of rows in the matrix.
The next line of the input consists of an integer, c that corresponds to the number of columns in the matrix.
The next 'm*n' lines in the input corresponds to the elements in the matrix.

Note: Row always starts from “0”.

Output Format:
Output is an integer value , which represents row number with maximum number of 1’s.
Refer sample input and output for formatting details.

Sample Input1:
4
4
1 0 0 0
0 0 1 1
1 1 1 0
1 0 0 0
Sample Output1:
2

*/

import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        int max=0,prev=0;
        for(int i= 0 ;i<n;i++)
        {   
            int count = 0;
            for(int j = 0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1)
                {
                    count++;
                }
            }
            if(prev<count)
            {
                max =i;
                prev = count;
            }
        }
        System.out.print(max);
    }
}
