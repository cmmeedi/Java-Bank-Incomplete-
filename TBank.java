import java.util.Scanner;

public class TBank extends Account{	

	static Scanner sc = new Scanner(System.in);
	
	
	
	public void BMenu() {
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Check Balance *|");
		System.out.println("|* 2.) Deposit       *|");
		System.out.println("|* 3.) Withdraw      *|");
		System.out.println("|* 4.) Transfer      *|");
		System.out.println("|* 5.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		
		if(sc.nextInt() == 1) {
			CheckBalanceAccounts();
		}
		else if(sc.nextInt() == 2) {
			MakeDeposit();
		}
		else if(sc.nextInt() == 3) {
			MakeWithdraw();
		}
		else if(sc.nextInt() == 4) {
			
		}
		else if(sc.nextInt() == 5) {
			System.exit(0);
		}
	}
	
	public void CheckingBalance() {
		System.out.println("_______________________________________");
		System.out.println("Your current Checking Balance is: " + "$" + checking);
		System.out.println("What would you like to do next?");
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Deposit       *|");
		System.out.println("|* 2.) WithDraw      *|");
		System.out.println("|* 3.) Back to Menu  *|");
		System.out.println("|* 4.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		if(sc.nextInt() == 0) {
			System.exit(0);
		}
		else if(sc.nextInt() == 1) {
			CheckingDeposit();
		}
		else if(sc.nextInt() == 2) {
			CheckingWithdraw();
		}
		else if(sc.nextInt() == 3) {
			BMenu();
		}
	}
	
	public void CheckingDeposit() {
		System.out.println("How much would you like to deposit?");
		int amount = sc.nextInt();
		this.checking = checking + amount; 
		System.out.println("After your deposit of" + amount
				+ "Your new Checking Balance is: " + "$" + checking);
	}
	
	public void CheckingWithdraw() {
		System.out.println("How much would you like to withdraw?");
		int amount = sc.nextInt();
		this.checking = checking - amount; 
		System.out.println("Your new Checking Balance is: " + "$" + checking);
	}
	
	public void SavingBalance() {
		System.out.println("_______________________________________");
		System.out.println("Your current Savings Balance is:" + "$" + saving);
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Deposit       *|");
		System.out.println("|* 2.) WithDraw      *|");
		System.out.println("|* 3.) Back to Menu  *|");
		System.out.println("|* 4.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		if(sc.nextInt() == 1) {
			SavingDeposit();
		}
		else if(sc.nextInt() == 2) {
			SavingWithdraw();
		}
		else if(sc.nextInt() == 3) {
			BMenu();
		}
	}
	
	public void SavingDeposit() {
		System.out.println("How much would you like to deposit?");
		int amount = sc.nextInt();
		this.checking = saving + amount; 
		System.out.println("After your deposit of" + amount
				+ "Your new Savings Balance is: " + "$" + saving);
	}
	
	public void SavingWithdraw() {
		System.out.println("How much would you like to withdraw?");
		int amount = sc.nextInt();
		this.checking = saving - amount; 
		System.out.println("Your new Checking Balance is: " + "$" + saving);
	}
	
	public void CheckBalanceAccounts() {
		
		System.out.println("Which account would you like to check the balance of?");
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Checking      *|");
		System.out.println("|* 2.) Savings       *|");
		System.out.println("|* 3.) Back to Menu  *|");
		System.out.println("|* 3.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		
		int choice = sc.nextInt();
		if(sc.nextInt() == 0) {
			System.exit(0);
		}
		else if(choice == 1) {
			CheckingBalance();
		}
		else if(choice == 2) {
			SavingBalance();
		}
		else if(choice == 3) {
			BMenu();
		}
	}
	
	public void MakeDeposit(){
		
		System.out.println("Which account would you like to make a deposit to?");
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Checking      *|");
		System.out.println("|* 2.) Savings       *|");
		System.out.println("|* 3.) Back to Menu  *|");
		System.out.println("|* 3.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			CheckingBalance();
		}
		else {
			SavingBalance();
		}
	}
	
	public void MakeWithdraw() {
		System.out.println("Which account would you like to make a withdraw from?");
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Checking      *|");
		System.out.println("|* 2.) Savings       *|");
		System.out.println("|* 3.) Back to Menu  *|");
		System.out.println("|* 3.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			CheckingBalance();
		}
		else {
			SavingBalance();
		}
	}
	

	public void Transfer() {
		int amount = sc.nextInt();
		
		System.out.println("Which account would you like to transfer from?");
		System.out.println("_______________________");
		System.out.println("***********************");
		System.out.println("|* 1.) Checking      *|");
		System.out.println("|* 2.) Saving        *|");
		System.out.println("|* 3.) Back to Menu  *|");
		System.out.println("|* 4.) Exit          *|");
		System.out.println("|---------------------|");
		System.out.println("***********************");
		
		if(sc.nextInt() == 1) {
			this.checking = checking - amount;
			System.out.println("your remainig Checking balance is: " +
			"$" + checking);
			this.saving = saving + amount;
			System.out.println("Your new Savings balance is: " + 
			"$" + saving);
		}
		else if(sc.nextInt() == 2) {
			this.saving = saving - amount;
			System.out.println("your remainig Savings balance is: " +
			"$" + saving);
			this.checking = checking + amount;
			System.out.println("Your new Checking balance is: " + 
			"$" + saving);
		}
		else if(sc.nextInt() == 3) {
			BMenu();
		}
		else if(sc.nextInt() == 4) {
			System.exit(0);
		}
	}
	
	
	public void Overdraft() {
		System.out.println("Your account currently does not have sufficient funds"
				+ "You may proceed but you will be charged a $35 overdraft fee");
		System.out.println("Would you like to proceed?");
	}
	
}
