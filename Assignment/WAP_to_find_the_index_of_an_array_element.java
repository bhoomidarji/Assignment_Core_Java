package Assignment;

import java.util.Scanner;

public class WAP_to_find_the_index_of_an_array_element {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println(" --- Enter an Array Elements --- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to search : ");
		int n = sc.nextInt();
		int i;
		for(i=0; i<a.length; i++) {
			if(a[i] == n)
				break;
		}
		if(i == a.length)
			System.out.println(n + " not found");
		else
			System.out.println(n + " found at : " + i);
	}
}
