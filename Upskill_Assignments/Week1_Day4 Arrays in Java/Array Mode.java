/*

Array Mode

Write a program to find the mode of the elements in the array.

The mode in a list of numbers refers to the list of numbers that occur most frequently.

It is important to note that there can be more than one mode and if no number occurs more than once in the set, then there is no mode for that set of numbers.

 

Input and Output Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Display ‘The mode of the array is none’ when no mode finds in the array.

Assume that the maximum number of elements in the array is 20.

Assume that in the input dataset there is 1 mode or no mode at all.

Refer sample input and output for formatting specifications.

 

[All text in bold corresponds to the input and the rest corresponds to output.]

 

Sample Input and Output 1 :

Enter the number of elements in the array

5

Enter the elements in the array

2

4

1

3

5

The mode of the array is none

 

Sample Input and Output 2 :

Enter the number of elements in the array

5

Enter the elements in the array

2

4

2

3

5

The mode of the array is
2

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int y= 0, x = 1;
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count>x)
            {
                x = count;
                y = a[i];
            }
        }
        if(x==1)
        {
            System.out.println("The mode of the array is none");
        }
        else{
            System.out.println("The mode of the array is\n"+y);
        }

    }

}
