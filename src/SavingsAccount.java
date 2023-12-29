
public class SavingsAccount extends BankAccount{
	
	
	public SavingsAccount(String num,String holder, double bal) {
		setaccNumber(num);
		setaccHolder(holder);
		setBal(bal);
		// TODO Auto-generated constructor stub
	}


	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void deposit(double amount) {
		setBal(getBal()+amount);
		System.out.println("Your account balance is "+ getBal());
	}


	public void withdraw(double amount) {
		if (getBal() >= amount) {
            setBal(getBal() - amount);
            System.out.println("Withdrawn " + amount + ". New balance: " + getBal());
        } else {
            System.out.println("Insufficient funds!");
        }
		
	}


	public void displayAccountInfo() {
		System.out.println("Savings Account Information:");
        System.out.println("Account Number: " +getaccNumber());
        System.out.println("Account Holder: " + getaccHolder());
        System.out.println("Balance: $" + getBal());
        System.out.println("Interest Rate: " + getInterestRate() + "%");
		
	}
	
}
