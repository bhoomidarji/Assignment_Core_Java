package Assignment;

import java.util.Scanner;

public class WAP_to_iterate_through_all_elements_in_an_array_list {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of Array Elements you want to add : ");
        int s=sc.nextInt();
        int a[] = new int[s];
        System.out.println(" --- Enter an Array Elements --- ");
        for (int i=0; i<a.length; i++) {
            System.out.print("Enter " +i+ " Element : ");
            a[i] = sc.nextInt();
        }
        System.out.println(" --- Iterate through an Array Elements --- ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " element : " + a[i]);
        }
    }

}
