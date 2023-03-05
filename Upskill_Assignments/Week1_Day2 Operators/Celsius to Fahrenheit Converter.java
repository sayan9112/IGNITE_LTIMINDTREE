/*

Celsius to Fahrenheit Converter

The relationship between Celsius (C) and Fahrenheit (F) degrees for measuring temperature is linear. Find an equation relating C and F if 0 C corresponds to 32 F and 100 C corresponds to 212 F.
Write a program to simulate Celsius to Fahrenheit Converter.


Input Format:


Input consists of a single integer which corresponds to a measure of temperature in Celsius.


Output Format:

The output is an integer indicates the Fahrenheit for the given Celsius.
All floating-point values are displayed correctly to 1 decimal place.
Refer to Sample Input and Output for exact formatting specifications.

 

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output.]


Temperature in Celsius:

12

Temperature in Fahrenheit is 53.6F

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in Celsius:");
        float x = sc.nextFloat();
        float f = ((x*9)/5)+32;
        System.out.printf("Temperature in Fahrenheit is %.1fF",f);
        
            // Fill your code here

        
     }
}
