/*

Number Series Generation

Write a program to generate numbers between the given range and print the numbers which are divisible by 2 and not divisible by 3 and 5.


Input Format :

  Input consists of range values a and b (integers) . Always a<b.

Output Format :

  Output consists of integers between the range.

Refer Sample Input and Output for further details.

[ All text of bold corresponds to Input and the rest output]

Sample Input and Output  1 :

Enter the Range :
1
40
2 4 8 14 16 22 26 28 32 34 38

Sample Input and Output  2 :

Enter the Range :
20
80
22 26 28 32 34 38 44 46 52 56 58 62 64 68 74 76

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the range :");
            int a = sc.nextInt();
            int b= sc.nextInt();
            while(a<b)
            {
                if(a%2==0 && a%3!=0 && a%5!=0)
                {
                    System.out.print(a+" ");
                }
                a++;
            }
        
     }
}
