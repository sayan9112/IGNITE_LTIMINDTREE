/*


Print Matrix in Spiral form


Given a 2D array, write a program to print it in spiral form.

Input and Output Format:
The first line of the input consists of an integer, r that corresponds to the number of rows in the matrix.
The next line of the input consists of an integer, c that corresponds to the number of columns in the matrix.
The next 'm*n' lines in the input correspond to the elements in the matrix.
Output is a matrix.

Sample Input1:
4
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

*/


import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int i,k=0,l=0;
        while(k<n && l<m)
        {
            for(i=l;i<m;i++)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;
            for(i=k;i<n;i++)
            {
                System.out.print(a[i][m-1]+" ");
            }
            m--;
            if(k<n)
            {
                for(i=m-1;i>=l;i--)
                {
                    System.out.print(a[n-1][i]+" ");
                }
                n--;
            }
            if(l<m)
            {
                for(i=n-1;i>=k;i--)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
    }
}




