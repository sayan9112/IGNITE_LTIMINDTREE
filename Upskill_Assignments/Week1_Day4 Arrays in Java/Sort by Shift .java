/*

Sort by Shift 



 

One day, Mahirl is interested in finding how to sort a sequence of integers a1, a2, ... an in non-decreasing order.




Being a young kid, the only operation she can perform is a unit shift. That is, she can move the last element of the sequence to its beginning:

a1, a2, ..., an → an, a1, a2, ..., an - 1.

 

Help Mahirl to calculate: What is the minimum number of operations that she needs to sort the sequence?

 

Input and Output Format:

 

The first line contains an integer, n (2 ≤ n ≤ 105).

The second line contains n integer numbers a1, a2, ..., an (1 ≤ ai ≤ 105).

 

If it's impossible to sort the sequence output -1. Otherwise output the minimum number of operations Mahirl needs to sort it.

 

Sample Input 1

2

2 1

Sample Output 1

1

 

Sample Input 2

3

1 3 2

Sample Output 2

-1

 

Sample Input 3

2

1 2

Sample Output 3

0

*/


import java.util.*;

public class Main {
    public static void main(String args[]){
        //Fill your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        int count=0;
        boolean f =false;
        for(int i= 0 ;i<n-1;i++)
        {  
              if(Arrays.equals(b,a))
             { 
                   System.out.print(count);
                   break;
             }
              int x = a[n-1];
             for(int j = n-1;j>0;j--)
             {
                 a[j] = a[j-1];
             }
             count++;
             a[0] = x;
              if(Arrays.equals(b,a))
             { 
                      System.out.print(count);
                        f = true;
                         break;
             }
           

        }
        if(count>=n-1 && f !=true )
        {
            System.out.print("-1");
        }
    }
}

 
