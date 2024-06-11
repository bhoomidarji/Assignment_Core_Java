package Assignment;

import java.util.Scanner;

public class W_A_J_P_to_take_three_numbers_from_the_user_and_print_the_greatest_number {
	public static void main(String[] args) {
		int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter A :  ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			System.out.print("Enter C : ");
			c=sc.nextInt();
			if (a>b)
			{
				if(a>c)
				{
					System.out.println("A is max");
				}
				else
					{
						System.out.println("C is max");
					}
				}
			else
			{
				if(b>c)
				{
					System.out.println("B is max");
				}
				else
				{
					System.out.println("C is max");
				}
			}
		}
		
		
		
		
	}

