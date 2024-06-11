package Assignment;

import java.util.Scanner;

public class WAP_to_compute_the_sum_of_the_first_100_prime_numbers {
	public static void main(String[] args)
	{
        int sum=0;
        for (int i=2; i<=100; i++) 
        {
            int d;
            for (d=2; d<i; d++) 
            {
                if (i%d==0) 
                break;
            }
            { if (d==i)
                sum=sum+i;
            }
        }
        System.out.println("sum of first 100 prime number is : " +sum);
    }
}


		

		
																										
	
		
	

	

		
