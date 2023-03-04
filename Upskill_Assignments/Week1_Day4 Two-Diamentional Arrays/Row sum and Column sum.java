/*

Row sum and Column sum

Write a program to find row sum and column sum of a given matrix.

Input format :

Input consists of row size,r and columun size,c followed by r*c values.

Output Format :

Output consists of sum of each row and sum of  each column values in the input matrix.

[ Refer Sample Input and Output for further details ]

Sample Input and Output  :

[ All text of bold corresponds to Input and the rest output ]

Enter the row size

2

Enter the column size

2

Enter the matrix values

1

5

4

7

The matrix is

1 5

4 7

Row 1 sum is 6

Row 2 sum is 11

Column 1 sum is 5

Column 2 sum is 12

*/


import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int n= sc.nextInt();
        System.out.println("Enter the column size");
        int m= sc.nextInt();
        System.out.println("Enter the matrix values");
        int [][] a = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is");
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum;
         for(int i =0;i<n;i++)
         {  
             sum =0;
             for(int j =0;j<m;j++)
             {
                 sum = sum + a[i][j];
             }
             System.out.println("Row "+(i+1)+" sum is "+sum);
         }
          for(int j =0;j<m;j++)
         {  
             sum =0;
             for(int i =0;i<n;i++)
             {
                 sum = sum + a[i][j];
             }
             System.out.println("Column "+(j+1)+" sum is "+sum);
         }
    }
}

