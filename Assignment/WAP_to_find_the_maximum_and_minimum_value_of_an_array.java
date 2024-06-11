package Assignment;

import java.util.Scanner;

public class WAP_to_find_the_maximum_and_minimum_value_of_an_array {
	    public static void main(String[] args) {
	    	int i,min,max;
	    	
	        int a[] = new int[5];
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Any Five Elements : ");
	        System.out.println("-------------------------------------------");
	        for(i=0;i<a.length;i++)
			{
				System.out.print("Enter "+i+" Element : ");
				a[i]=sc.nextInt();
			}
	        min = a[0];
	        max = a[0];
	        for (i=1; i<a.length;i++) 
	           {
	            if (a[i]<min) 
	            {
	                min=a[i];
	            } 
	            else if (a[i]>max)
	            {
	                max=a[i];
	            }
	        }
	        System.out.println("-------------------------------------------");
	        System.out.println("Minimum value in the array is " + min);
	        System.out.println("-------------------------------------------");
	        System.out.println("Maximum value in the array is " + max);
	        System.out.println("-------------------------------------------");

	    }
	

		
	}

