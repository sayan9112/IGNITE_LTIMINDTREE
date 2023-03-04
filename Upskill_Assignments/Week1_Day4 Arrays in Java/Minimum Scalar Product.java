/*

Minimum Scalar Product

 

You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar product of these vectors is a single number, calculated as x1y1+x2y2+...+xnyn.

 

Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.

Note:

Please use the same prompt statements given in the sample input and output

Input Format

The first line contains integer number n. The next two lines contain n integers each, giving the coordinates of v1 and v2 respectively.

 

Output Format

Output consists of a single integer, Y that corresponds to the minimum scalar product of all permutations of the two given vectors.

 

Limits

0 ≤ n ≤ 800

0 ≤ xi, yi ≤ 100000

 

Sample Input 1:

3

1 3 5

2 4 1

Sample Output 1:

15

 

Sample Input 2:

5

1 2 3 4 5

1 0 1 0 1

Sample Output 2:

6

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // your code here
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i= 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i= 0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<n;i++)
        {
            sum = sum + (a[i]*b[n-1-i]);
        }
        System.out.println(sum);

    }

}
