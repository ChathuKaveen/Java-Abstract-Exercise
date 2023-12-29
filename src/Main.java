
public class Main {
	public static void main(String [] args) {
		SavingsAccount savacc=new SavingsAccount("001","John",2000.0);
		CheckingAccount checkacc =new CheckingAccount("002","Marstin",1800.00);
		savacc.displayAccountInfo();
		System.out.println();
		checkacc.displayAccountInfo();
		
	}
}
