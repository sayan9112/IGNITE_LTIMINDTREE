/*

Range Minimum Query

 

The range minimum query (RMQ) problem looks as follows: You are given a list of n numbers and a sequence of queries. Each query is a pair of integers (L,R) such that 1 <= L <= R <= n. The answer to the query is the minimum of the values that occur in the list at (1-based) positions L through R, inclusive.

For example, if the list is (3,1,4,2,5), then:

The answer to the query (1,2) is min(3,1)=1

The answer to the query (2,4) is min(1,4,2)=1

The answer to the query (4,5) is min(2,5)=2

Assume: n<=50

Input and Output Format:

The first line of the input consists of an integer that corresponds to n, the number of elements in the list.

The next line of the input consists of the n integers in the list. The numbers in the list are separated by a space.

The next line of the input consists of k that corresponds to the number of range queries.

The next k lines of the input consists of 2 integers Li and Ri that correspond to L and R of each range query.

The output consists of k integers that correspond to the result of k queries.

Sample Input:

5

3 1 4 2 5

3

1 2

2 4

4 5

Sample Output:

1

1

2

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int min = nums[L-1];
            for (int j = L; j <= R; j++) {
                if (nums[j-1] < min) {
                    min = nums[j-1];
                }
            }
            System.out.println(min);
        }
    }
}
