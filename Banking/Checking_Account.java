package Banking;

public class Checking_Account {
	int acno;
	String cname;
	double balance;
	public Checking_Account(int acno, String cname, double balance) {
		this.acno = acno;
		this.cname = cname;
		this.balance = balance;
		System.out.println("Hello "+cname+",your Account Number "+acno+" Is Opened With "+balance+"Rs.");
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
public void withdraw(double amount) throws Insufficient_fund
{
	if(amount<=this.balance)
	{
		this.balance=this.balance-amount;
	}
	else
	{
		throw new Insufficient_fund(amount-this.balance);
	}
}
public void checkBalance()
{
	System.out.println("Current Balance : "+this.balance);
}
}