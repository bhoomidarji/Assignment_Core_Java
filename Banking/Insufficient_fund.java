package Banking;

public class Insufficient_fund extends Exception{
		double amount;
		public Insufficient_fund(double amount)
		{
			this.amount=amount;
		}
		public double getamount()
		{
			return this.amount;
		}
	}
