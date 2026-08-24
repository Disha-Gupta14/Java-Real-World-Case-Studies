import java.util.Scanner;
public class BankAccountIMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account No.:");
		long accountNo=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter Holder Name:");
		String holdername=sc.nextLine();
		System.out.print("Enter Balance:");
		double balance=sc.nextDouble();
		System.out.print("Enter Deposit Amount:");
		double depositAmount=sc.nextDouble();
		System.out.print("Enter Withdraw Amount:");
		double withdrawAmount=sc.nextDouble();
		System.out.print("Enter Interest Rate:");
		double interestRate=sc.nextDouble();
		SavingsAccount s1=new SavingsAccount(accountNo,holdername,balance,depositAmount,withdrawAmount,interestRate);
		s1.deposit();
		s1.withdraw();
		s1.calculateInterest();
		s1.displayAccount();
	}
}
class BankAccountI{
	long accountNo;
	String holdername;
	double balance,depositAmount,amountAfterDeposit,totalBalance,withdrawAmount;
	BankAccountI(long accountNo,String holdername,double balance,double depositAmount,double withdrawAmount){
		this.accountNo=accountNo;
		this.holdername=holdername;
		this.balance=balance;
		this.depositAmount=depositAmount;
		this.withdrawAmount=withdrawAmount;
	}
	public void deposit(){
		amountAfterDeposit=depositAmount+balance;
	}
	public void withdraw(){
		totalBalance=amountAfterDeposit-withdrawAmount;
	}
	public void displayAccount(){
		System.out.println("Account No.:"+accountNo);
		System.out.println("Holder Name:"+holdername);
		System.out.println("Balance:"+balance);
		System.out.println("Deposit Amount:"+depositAmount);
		System.out.println("Withdraw Amount:"+withdrawAmount);
		System.out.println("Total Balance:"+totalBalance);
	}
}
class SavingsAccount extends BankAccountI{
	double interestRate,balanceAfterInterest;
	SavingsAccount(long accountNo,String holdername,double balance,double depositAmount,double withdrawAmount,double interestRate){
		super(accountNo,holdername,balance,depositAmount,withdrawAmount);
		this.interestRate=interestRate;
	}
	public void calculateInterest(){
		balanceAfterInterest=super.totalBalance+((super.totalBalance*interestRate)/100);
	}
	public void displayAccount(){
		super.displayAccount();
		System.out.println("Balance After Interest:"+balanceAfterInterest);
	}
}

