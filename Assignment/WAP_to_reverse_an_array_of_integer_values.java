package Assignment;

import java.util.Scanner;

public class WAP_to_reverse_an_array_of_integer_values {
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

        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left = left + 1;
            right = right - 1;
        }

        System.out.println("====== After reverse an array");
        System.out.print("Array elements : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
