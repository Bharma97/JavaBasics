package bdd.APIFramework;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Scanner scnr = new Scanner(System.in);
    	 
         String strng = scnr.nextLine();
         
         StringBuilder result = new StringBuilder("");
         
           for (int i=0; i<strng.length(); i++){
        	   
            char chr = strng.charAt(i);
            
           if(chr>='A' && chr<='Z'){
        	   
               result.append((char)(chr+32));
               
           } else if(chr>='a' && chr<='z'){
        	   
               result.append((char)(chr-32));
               
           } else{
        	   
               result.append(chr);
               
           }
       
          }

           String answer = result.toString();
           System.out.println(answer);
    }
}
