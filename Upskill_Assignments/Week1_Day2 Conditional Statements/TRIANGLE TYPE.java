/*

TRIANGLE TYPE

Given the 3 angles of a triangle (in degrees), write a  program to determine whether it is a right triangle, isosceles triangle, right isosceles triangle or equilateral triangle.

Input Format:

Input consists of 3 lines. Each line consists of an integer.

 

Output Format:

Output consists of a single line. Refer sample output for the format.

 
Hint:
equilateral triangle: The sum of all three angles of an equiangular triangle is equal to 180 degrees.
Isosceles Triangle: An Isosceles triangle is a triangle which has two equal sides. Also, the two angles opposite to the two equal sides are equal.
Right angle triangle: When the angle between a pair of sides is equal to 90 degrees it is called a right-angle triangle.
Isosceles Right Triangle: An Isosceles Right Triangle is a right triangle that consists of two equal length legs. Since the two legs of the right triangle are equal in length

Sample Input 1:

60

60

60

 

Sample Output 1 :

Triangle is equilateral

 

Sample Input 2:

90

30

60

 

Sample Output 2:

Triangle is right

 

 

Sample Input 3:

50

50

80

 

Sample Output 3:

Triangle is isosceles

 

Sample Input 4:

45

45

90

 

Sample Output 4:

Triangle is right isosceles

 

Sample Input 5:

30

50

100


Sample Output 5:

Triangle is not special

 

Sample Input 6:

60

50

100

 

Sample Output 6:

Not a Triangle

*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c =sc.nextInt();
            if(a+b+c!=180)
            {
                System.out.println("Not a Triangle");
            }
           else if(a==b && b==c && c==60)
            {
                System.out.println("Triangle is equilateral");
            }
             else if((a!=b &&c==90) || (b!=c && a==90) || (c!=a && b==90) )
            {
                System.out.println("Triangle is right");
            }
             else if((a==b &&c!=90) || (b==c && a!=90) || (c==a && b!=90) )
            {
                System.out.println("Triangle is isosceles");
            }
            else if((a==b &&c==90) || (b==c && a==90) || (c==a && b==90) )
            {
                System.out.println("Triangle is right isosceles");
            }
            else{
                  System.out.println("Triangle is not special");
            }
        
     }
}
