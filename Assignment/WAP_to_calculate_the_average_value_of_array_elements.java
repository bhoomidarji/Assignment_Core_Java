package Assignment;

import java.util.Scanner;

public class WAP_to_calculate_the_average_value_of_array_elements { 
	    public static void main(String[] args) {
			int a[]=new int[5];
			int i,sum=0;
			double average=0;
			Scanner sc=new Scanner(System.in);
			System.out.println(" --- Enter an Array Elements --- ");
			for(i=0;i<a.length;i++)
			{
				System.out.print("Enter "+i+" Element : ");
				a[i]=sc.nextInt();
				sum=sum+a[i];	
			}
			{
			average=sum/5;
	    }
			System.out.println("----------------------------------------------------------------");
			System.out.println("sum of Array Elements = "+sum);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Average of Array Elements = "+average);
			System.out.println("----------------------------------------------------------------");
			
	    }
	    }

	

