package Assignment;

import java.util.Scanner;

public class WAP_to_demonstrate_try_catch_block {
	public static void main(String[] args) {
		int x,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Value : ");
		x=sc.nextInt();
	        try 
				{
	           if (x%2==0)
	            {
	        	   System.out.println("No Exception");
	            }
	          
	        } 
			   catch (ArithmeticException e) 
				{	            
				System.out.println("Exception caught: " +e.getMessage());
				}
	        
	        System.out.println("The End");
	    
	}}



