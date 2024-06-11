package Assignment;

public class Pattern_5 {
	public static void main(String[] args) {
		
	
	int i,j,k;
	
	for(i=1;i<=3;i++)
	{
		for(j=3;j>i;j--)
		{
			System.out.print(" ");
		}
		for(k=1;k<=(i*2-1);k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=2;i>=1;i--)
	{
		if(i==2) {
		for(j=4;j>3;j--)
		{
			System.out.print(" ");
		}}
		if(i==1) {
			for(j=5;j>3;j--)
			{
				System.out.print(" ");
			}
		}
		
		for(k=1;k<=(i*2-1);k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}

}


