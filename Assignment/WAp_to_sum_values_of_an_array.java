package Assignment;

import java.util.Scanner;

public class WAp_to_sum_values_of_an_array {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" --- Enter an Array Elements --- ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println("--------------------------");
		System.out.println("Sum of an Array Elements = "+sum);
		
				}
		
		
		
			
		}
		
		
	
