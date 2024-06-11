package Assignment;

import java.util.Scanner;

public class W_A_J_P_to_find_factorial_for_given_number {
	public static void main(String[] args) {
		int a,n,i;
		n=1;
		i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		a=sc.nextInt();
		
		while (n<=a)
		{
		i*=n;
		n++;
		}
		System.out.println("factorial number : "+i);
		
		
		
	}
	}


