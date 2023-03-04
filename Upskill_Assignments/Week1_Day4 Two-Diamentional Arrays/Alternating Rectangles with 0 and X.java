/*

Alternating Rectangles with 0 and X
Write a code, which inputs two numbers m and n. Create a matrix of size m x n (m rows and n columns) in which every elements is either X or 0.

The Xs and 0s must be filled alternatively, the matrix should have outermost rectangle of Xs, then a rectangle of 0s, then a rectangle of Xs, and so on.

Note: m and n should be greater than 2.

Input Format:

The first line of the input consists of an integer, m that corresponds to the number of rows in the input array.

The next line of the input consists of an integer, n that corresponds to the number of columns in the input array.

Output Format:

Output is a matrix with alternate rectangle with 0 and X.

Refer sample input and output for formatting details.

Sample Input1:

3
3

Sample Output1:

X X X
X 0 X
X X X 

Sample Input2:

4
5

Sample Output2:

X X X X X
X 0 0 0 X
X 0 0 0 X
X X X X X

Sample Input3:

5
5

Sample Output3:

X X X X X 
X 0 0 0 X 
X 0 X 0 X 
X 0 0 0 X 
X X X X X

*/

import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        int i, k = 0, l = 0;
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = m, c = n;
        char a[][] = new char[m][n];
        char x = 'X'; 
        while (k < m && l < n)
        {
            for (i = l; i < n; ++i)
            {
                a[k][i] = x;
            }
            k++;
            for (i = k; i < m; ++i)
            {
                a[i][n-1] = x;
            }
            n--;
            if (k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    a[m-1][i] = x;
                }
                m--;
            }
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    a[i][l] = x;
                }
                l++;
            }
            x = (x == '0')? 'X': '0';
        }
        for (i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
