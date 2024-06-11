package Assignment;

import java.util.Scanner;

public class WAP_to_Compare_Two_String {
	public static void main(String[] args) {
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first String :  ");
		a=sc.next();
		System.out.print("enter second String :  ");
		b=sc.next();
		
		if (a==b)
		{
			System.out.println("Entered Strings Are Equal");
		}
		else
		{
			System.out.println("Entered Strings Are Not Equal");
		}
		
	}

}
