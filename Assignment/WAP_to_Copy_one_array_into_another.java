package Assignment;

import java.util.Scanner;

public class WAP_to_Copy_one_array_into_another {
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
        System.out.print("First Array elements : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.print("Second Array elements : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
