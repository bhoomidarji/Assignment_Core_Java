package Assignment;

import java.util.Scanner;

public class WAP_to_remove_the_third_element_from_a_array_list {
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
        System.out.print("Array elements before removal : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int b[] = new int[a.length - 1];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 2)
                continue;
            b[idx] = a[i];
            idx = idx + 1;
        }
        a = b;
        System.out.print("Array elements after removal : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
