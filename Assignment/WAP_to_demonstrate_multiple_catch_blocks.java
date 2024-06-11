package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WAP_to_demonstrate_multiple_catch_blocks {
	public static void main(String[] args) {
		int x,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Value : ");
	        try{
	        	x=sc.nextInt();
	           if (x/0==0)
	            {
	        	   System.out.println("No Exception");
	            }
	          
	        } 
			   catch (ArithmeticException e) 
				{	            
				System.out.println("Exception caught: " +e.getMessage());
				}
	        catch (InputMismatchException i)
	        {
				System.out.println("Exception caught: " +i.getMessage());
	        }
	        
	        
	        System.out.println("The End");
	    
	}}


