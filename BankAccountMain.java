import java.util.Scanner;
public class BankAccountMain{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter account number:");
	int accNo=sc.nextInt();
	System.out.print("Enter account holder name:");
	String accHolderName=sc.next();
	System.out.print("Enter account type:");
	String accType=sc.next();
	System.out.print("Enter current balance:");
	int balance=sc.nextInt();
	System.out.print("Enter amount to be deposited:");
	int amountDeposit=sc.nextInt();
	System.out.print("Enter amount to be withdrawn:");
	int amountWithdrawn=sc.nextInt();
	System.out.println("Default Constructor:");
	BankAccount b1=new BankAccount();
	b1.deposit(0);
	b1.withdraw(0);
	b1.display();
	System.out.println("Parameterised Constructor:");
	BankAccount b2=new BankAccount(accNo,accHolderName,accType,balance);
	b2.deposit(amountDeposit);
	b2.withdraw(amountWithdrawn);
	b2.display();
	System.out.println("Duplicate Account:");
	BankAccount b3=new BankAccount(b2.accNo,b2.accHolderName,b2.accType,b2.balance);
	b3.deposit(amountDeposit);
	b3.withdraw(amountWithdrawn);
	b3.display();
	System.out.println("Parameterised(name) Account:");
	BankAccount b4=new BankAccount(accHolderName);
	b4.deposit(0);
	b4.withdraw(0);
	b4.display();
	System.out.println("Parameterised(name and balance) Account:");
	BankAccount b5=new BankAccount(accHolderName,balance);
	b5.deposit(amountDeposit);
	b5.withdraw(amountWithdrawn);
	b5.display();
	}
}

class BankAccount{
	int accNo, balance, amountDeposit, amountWithdrawn, balanceAfterDeposit, balanceAfterWithdrawn;
	String accHolderName, accType;
	BankAccount(){
		accNo=0;
		accHolderName="Unknown";
		accType="Saving";
		balance=0;
		amountDeposit=0;
		amountWithdrawn=0;
	}
	public BankAccount(String accHolderName){
		this.accHolderName=accHolderName;
	}
	public BankAccount(String accHolderName, int balance){
		this.accHolderName=accHolderName;
		this.balance=balance;
	}
	public BankAccount(int accNo, String accHolderName, String accType, int balance){
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.accType=accType;
		this.balance=balance;
	}
	public void deposit(int amountDeposit){
		this.amountDeposit=amountDeposit;
		balanceAfterDeposit=balance+amountDeposit;
	}
	public void withdraw(int amountWithdrawn){
		this.amountWithdrawn=amountWithdrawn;
		balanceAfterWithdrawn=balanceAfterDeposit-amountWithdrawn;
	}
	public void display(){
		System.out.println("+--------------------------------------+");
		System.out.println("|Account No.:"+accNo+"                      |");
		System.out.println("|Account Holder Name:"+accHolderName+"             |");
		System.out.println("|Account Type:"+accType+"                    |");
		System.out.println("+--------------------------------------+");
		System.out.println("|Balance in Account:              "+balance+"|");
		System.out.println("|Deposited:                       "+amountDeposit+"|");
		System.out.println("+--------------------------------------+");
		System.out.println("|Balance in Account:              "+balanceAfterDeposit+"|");
		System.out.println("|Withdrawn:                       "+amountWithdrawn+"|");
		System.out.println("+--------------------------------------+");
		System.out.println("|Total Balance:                   "+balanceAfterWithdrawn+"|");
		System.out.println("+--------------------------------------+");
	}
}

