/*

Number Pattern

Write a program to print the given pattern.

Input Format:

Input consists of a single integer.

Output Format:

Refer sample outputs. There is a trailing space at the end of each line.

Sample Input:

5

Sample Output:

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=n;i>=1;i--)
            {
                for(int j=n;j>=n-i+1;j--)
                {
                    System.out.print(j+" ");
                }
                System.out.println("\n");
            }
        
     }
}
