package Assignment;

import java.util.Scanner;

public class WAJP_which_will_ask_the_user_to_enter_his_her_marks {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's marks : ");
        int n = sc.nextInt();
        if (n >= 91)
            System.out.println("AA");
        else if (n >= 81)
            System.out.println("AB");
        else if (n >= 71)
            System.out.println("BB");
        else if (n >= 61)
            System.out.println("BC");
        else if (n >= 51)
            System.out.println("CD");
        else if (n >= 41)
            System.out.println("DD");
        else
            System.out.println("Fail");
    }

}



