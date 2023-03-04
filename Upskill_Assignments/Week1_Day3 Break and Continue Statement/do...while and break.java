/*

do...while and break

ABC Hospital has a database system that has got the details of all their patients. The database first page contains only the name and Identity number of all the patients. Hospital management plans to collect this details (ie Identity number and Name) from all the patients who come for consultation for the second time. Given the Identity number and the name, provide if the Id is valid and also the number of valid ID count by writing a program.

Note:
The hospital management framed that the identity number is valid if it is a 4 digit alphanumeric and has digits in the first two places and alphabets in the last two places. If any patient gives a Invalid Identity number, then further collecting of the Identity number is stopped.


Input Format :

First Input is a string that denotes the Identity number of the patient.
Second Input is a string that corresponds to the name of the patient.
Third Input is a string that indicates if the patient Identity is valid or not.

Output Format :
Output is an Integer that corresponds to the Number of entries of patients or displays a message that the Ids are Invalid if the Ids are not valid.

Sample Input 1:
43Sd
Harini
yes
26HJ
Harish
yes
89Jk
Vino
no

Sample Output 1:
3




Sample Input 2:
43Sd
Harini
yes
265J


Sample Output 2:
1

*/

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        
            // Fill your code here
             Scanner sc =new Scanner(System.in);
             boolean b=true;
             int c=0;
             String name=null,val=null;
             do
             {   
            String id = sc.nextLine();
            if(sc.hasNextLine()) {
             name = sc.nextLine();
             }
             if(sc.hasNextLine())
             {
                 val = sc.nextLine();
             }

            if(id.length()!=4 || name== null || val==null)
            {
                b = true;
                break; 
            }  
            else if(val.length()!=0 && val.charAt(0)==110 && val.charAt(1)==111)
            {  
                c++;
                b = true;
                break;
            }
            for(int i=0;i<id.length();i++)
            {
                if(id.charAt(i)>=48 && id.charAt(i)<=57 && i<id.length()/2)
                {
                    b = false;
                }
                else if(((id.charAt(i)>=65 && id.charAt(i)<=90)|| (id.charAt(i)>=97 && id.charAt(i)<=122) )&& i>=id.length()/2)
                {
                    b =false;
                }
                else{
                    b = true;
                    break;
                }
            }  
            if(b==false)
            {
                c++;
            }
            else
            {
                break;
            }
            b = true;
         }while(b);
             System.out.print(c);
     }
}

