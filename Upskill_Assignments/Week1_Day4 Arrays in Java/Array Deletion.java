/*

Array Deletion

Write a program to delete an element from an array. 

Input Format:

The first line of the input consists of an integer, n that corresponds to the number of elements in the input array.

The next 'n' lines in the input correspond to the elements in the array.Assume that the maximum number of elements in the array is 20.
Next input correspond to the location where you wish to delete an element.

Output Format:

Display the array element after deletion if the given location value is less than array size otherwise print “Invalid Input”.

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output 1:

Enter the number of elements in the array

5

Enter the elements in the array

1

2

3

4

5

Enter the location where you wish to delete an element

4

Array after deletion is

1

2

3

5

Sample Input and Output 2:

Enter the number of elements in the array

5

Enter the elements in the array

1

2

3

4

5

Enter the location where you wish to delete an element

10

Invalid Input

*/


import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]  = sc.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int x = sc.nextInt();
        if(x<=n)
        {     
            int [] b = new int[n-1];

             for(int i=0,j=0;i<n;i++)
             {
               if(i==x-1)
               {
                   continue;
               }
               b[j++]=a[i];
             }
            System.out.println("Array after deletion is");
            for(int i=0;i<n-1;i++)
          {
            System.out.println(b[i]);
          }
        }
        else{
            System.out.println("Invalid Input");
        }
    
    }

}






