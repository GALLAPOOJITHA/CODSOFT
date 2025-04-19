package firstclass;

import java.util.Scanner;
class BankAccount{
	private double balance;
	public BankAccount(double initialbalance) {
		this.balance=initialbalance;
	}
	public double getbalance() {
		return balance;
	}
	public String Withdraw(double amount) {
		if (amount<=0) {
			System.out.println("Withdraw amount must be positive");
		}
		else if (amount>balance){
			System.out.println("insufficient amount");
			}
		
			balance-=amount;
			System.out.println("withdrawal of $:"+amount+"successfull");
		return "True";
	}
	public void Deposit (double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Deposited successfully.current balance:$"+String.format("%,2f",balance));
		}
		else {
			System.out.println("Invalid amount.please enter valid amount");
		}
	}
	
	public double getBalance() {
		return balance;
	}
}

class ATM{
	private BankAccount account;
	private Scanner scanner;
	public ATM(BankAccount account) {
	
		this.account=account;
		this.scanner=new Scanner(System.in);
	}
	public void display()
	{
		System.out.println("\n Welcome to the ATM!");
		System.out.println("1.checkBalance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("5.Enter your choice:");
		}
	public void checkBalance()
	{
    	System.out.println("Your current balance:"+account.getBalance());
	}
	public void Deposit()
	{
		System.out.println("Enter amount to be deposited is:$ ");
		double amount=scanner.nextDouble();
		account.Deposit(amount);
}
	public void Withdraw()
	{
		System.out.println("Enter the amount to withdraw:$");
		double amount=scanner.nextDouble();
		if (amount>0)
		{
			account.Withdraw(amount);
		}
		else
		{
			System.out.println("Invalid withdraw amount");
		}
		
		}
	public void run() {
		int choice ;
		do {
			display();
			choice=scanner.nextInt();
			scanner.nextLine();
			
			
			switch (choice) {
			case 1:checkBalance();
			break;
			case 2:Deposit();
			break;
			case 3:Withdraw();
			break;
			case 4:System.out.println("THANK YOU!");
			break;
			default:
			}
			System.out.println("Welcome,please inset your card");}
		while(choice!=4);
		scanner.close();
		}
	}
	
public class task3 {

	public static void main(String[] args) {
		BankAccount useraccount=new BankAccount(1000.0);
		ATM atm=new ATM(useraccount);
		atm.run();
	
		

	}

}
