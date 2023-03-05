/*

Character Pattern

 

Rita got busy with her customers and she forgot sending the patterns to Sita by mail. Meanwhile, Sita started working on some patterns to gain confidence in using nested loops.

 

Write a program to generate the pattern using nested for loops.

****

****

****

****

 

Input and Output Format:

Input consists of a single integer, n.

 

Sample Input 1:

4

 

Sample Output 1:

****

****

****

****

 

Sample Input 2:

5

 

Sample Output 2:

*****

*****

*****

*****

*****

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.println("*");
                }
                System.out.println("\n");
            }
        
     }
}
