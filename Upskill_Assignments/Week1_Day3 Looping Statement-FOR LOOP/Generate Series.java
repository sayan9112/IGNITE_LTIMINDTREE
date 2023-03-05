/*

Generate Series

Write a program to generate the below series:

4,32,128,256, ….n

Input and Output Format:

The first line is the input consists of a single integer that corresponds to n.

The output consists of the series 4,32,128,…..n separated by a space.

Sample Input 1:

4

Sample Output 1:

4 32 128 256

Sample Input 2:

2

Sample Output 2:

4 32

Sample Input 3:

6

Sample Output 3:

4 32 128 256 256 0 

*/

import java.util.*;
import java.*;
public class Main {

    public static void main(String[] args) {
        //fill your code here
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a =4,b=3;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            int j = (int)Math.pow(2,b);
            b--;
            a = a*j;
        }
    }

}
