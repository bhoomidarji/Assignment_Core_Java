package Assignment;

import java.util.Scanner;

public class WAP_to_update_specific_array_element_by_given_element {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Array Elements you want to add : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println(" --- Enter an Array Elements --- ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter " + i + " Element : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-----------------------");
        System.out.print("Array elements : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element you want update: ");
        int x = sc.nextInt();
        System.out.print("Enter new element : ");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                a[i] = n;
            }
        }
        System.out.println("-----------------------");
        System.out.print("Array elements (after updation) : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
