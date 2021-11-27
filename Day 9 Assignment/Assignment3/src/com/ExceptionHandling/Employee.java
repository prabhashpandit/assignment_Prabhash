package com.ExceptionHandling;

import java.util.Scanner;

public class Employee extends Exception {
	
	    public static void main(String[]args){

	      Scanner age = new Scanner (System.in);
	      System.out.println("Enter your age");
	      int a = age.nextInt();
	      System.out.println("Enter you name");
	      String b = age.next();

	  try{  
	     if(a <18 || a>60){         
	        throw new Exception();
	     }          
	    }
	    catch(Exception  employee){
	    System.out.println("You entered an invalid age" + a);        
	    }
	    finally{
	        System.out.println("Your age is " + a);
	        System.out.println("Your name is " + b);
	    }   
	}

}
