/*

Mahirl and Matrix 

 

Can you please help Mahirl in generating a n*n matrix with values following the pattern shown in the sample output?

 

Input Format:

 

The first line of the input consists of a single integer that corresponds to n.

The second line of the input consists of an integer that corresponds to the row number of the element that needs to be printed.

The third line of the input consists of an integer that corresponds to the column number of the element that needs to be printed.

 

Assume that the row number and column number starts from 1.

 

Output Format :

 

Refer sample output. All values in a row are separated by a space. There is a trailing space at the end of each row.

 

Sample Input 1 :

5

3

2

 

 

Sample Output 1:

1 10 11 20 21

2 9 12 19 22

3 8 13 18 23

4 7 14 17 24

5 6 15 16 25

 

8

 

Sample Input 2 :

6

4

5

 

Sample Output 2:

1 12 13 24 25 36

2 11 14 23 26 35

3 10 15 22 27 34

4 9 16 21 28 33

5 8 17 20 29 32

6 7 18 19 30 31

 

28

*/


import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int l =0,m=2;
        boolean b =true;
        int [][] a = new int[n][n];
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n;i++)
            {   
                if(j%2==0)
                {
                    a[i][j] = (i+1)+(n*l);
                    b = true;

                }
                else
                {
                    a[i][j] = (n*m)-i;
                    b= false;
                }
            }
          if(b)
          {
              l+=2;
           }
           else{
             m+=2;
           }
        }
          for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\n"+a[r-1][c-1]);
        
    }
}


