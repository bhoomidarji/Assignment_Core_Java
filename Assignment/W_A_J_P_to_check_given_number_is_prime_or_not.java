package Assignment;

import java.util.Scanner;

public class W_A_J_P_to_check_given_number_is_prime_or_not {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter No. : ");
		if (n%2==0)
		{
			System.out.println("it's not a prime number");
	}
		else
		{
			System.out.println("it's a prime number");
		}
	}
}
