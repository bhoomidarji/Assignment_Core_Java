package Assignment;

import java.util.Scanner;

public class W_A_J_P_for_create_fibonacci_series {
	public static void main(String[] args) 
	{
		int n,a,b,sum;
		System.out.print("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=0;
		b=1;
		System.out.println("Fibonacci Series : ");
		for(int i=1; i<=n; i++) 
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}

}
