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

1 2 3 4 5

10 9 8 7 6

11 12 13 14 15

20 19 18 17 16

21 22 23 24 25

 

12

 

Sample Input 2 :

6

4

5

 

Sample Output 2:

1 2 3 4 5 6

12 11 10 9 8 7

13 14 15 16 17 18

24 23 22 21 20 19

25 26 27 28 29 30

36 35 34 33 32 31

 

20

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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   
                if(i%2==0)
                {
                    a[i][j] = (j+1)+(n*l);
                    b = true;

                }
                else
                {
                    a[i][j] = (n*m)-j;
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
