/*

Customer Address

Write a program to get the address details and display it using classes and objects.

Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names, and method names should be the same as specified in the problem statement.

Consider a class named Address and define the following public attributes

             
             Data Type	                                      Attribute

              String                                        	street
              String	                                        city
              int                                            	pincode
              String                                         	country


Create a class named Address and include the following methods 


            Method name 	                  Description

            void displayAddress()	          This method is used to display all the details.
 

Consider a Main class to include the main method and test the above class.

In the main method

Obtain the details of the Address.
Create an object for the Address class and assign the values to the attribute
Call the method displayAddress() in the Main class
The link to download the template code is given below
Code Template
Sample Input and Output:
[All text in bold corresponds to input and the rest corresponds to the output]

Enter Customer Address
Enter the street
13, Rockfort Street
Enter the city
Chennai
Enter the pincode
654035
Enter the country
India
Street: 13,Rockfort Street
City: Chennai
Pincode: 654035
Country: India

*/

import java.util.*;
public class Main{
    public static void main(String[] args){     
        Scanner sc= new Scanner(System.in);
        Address ad = new Address();
        System.out.println("Enter Customer Address");
         System.out.println("Enter the street");    
         ad.street = sc.nextLine();
         System.out.println("Enter the city");    
         ad.city = sc.nextLine();
         System.out.println("Enter the pincode");    
         ad.pincode = sc.nextInt();
         sc.nextLine();
         System.out.println("Enter the country");    
         ad.country = sc.nextLine();
         ad.displayAddress();
    }
}

public class Address{
             
                String street;
               String country;
                String city;
                int pincode;
                        
         void displayAddress() {
                System.out.println("Street: "+street);
                System.out.println("City: "+city);
                System.out.println("Pincode: "+pincode);
                System.out.print("Country: "+country);
        }
}
