package Assignment;

import java.util.Scanner;

public class WAP_to_find_the_second_largest_element_in_an_array {
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
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println();
        System.out.println("Second largest element in array is : " + secondMax);
    }
}


