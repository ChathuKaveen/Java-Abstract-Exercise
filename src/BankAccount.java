
public abstract class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	public String getaccNumber() {
		return accountNumber;
	}
	public void setaccNumber(String Num) {
		this.accountNumber=Num;
	}
	
	public String getaccHolder() {
		return accountHolder;
	}
	public void setaccHolder(String Num) {
		this.accountHolder=Num;
	}
	
	public double getBal() {
		return balance;
	}
	public void setBal(double Num) {
		this.balance=Num;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void displayAccountInfo();
}
