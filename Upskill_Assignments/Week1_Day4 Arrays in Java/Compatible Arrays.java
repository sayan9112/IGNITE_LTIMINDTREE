/*

 Compatible Arrays

2 arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i.  Write a  program to find whether 2 arrays are compatible or not.


Note:

Please use the same prompt statements given in the sample input and output

Input Format:

Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15.

Output Format:

Refer sample output for details.

Sample Input 1:

5

2

3

6

8

1

1

1

1

1

1

Sample Output 1:

Compatible



Sample Input 2:

5

2

3

6

8

1

1

1

1

1

2

Sample Output 2:

Incompatible

*/

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean x = true;
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            b[i] = sc.nextInt();
            if(a[i]<b[i])
            {
                x = false;
            }
        }
        if(x)
        {
            System.out.print("Compatible");
        }
        else
        {
            System.out.print("Incompatible");
        }
    

        
     }
}



















