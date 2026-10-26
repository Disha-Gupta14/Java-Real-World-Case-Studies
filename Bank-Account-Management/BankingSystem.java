//Create an abstract class BankAccount with methods deposit(), withdraw(), and abstract method calculateInterest(). 
//Create subclasses SavingsAccount and CurrentAccount and implement the interest calculation differently.
import java.util.Scanner;
public class BankingSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Deposit amount:");
		int depositAmount=sc.nextInt();
		System.out.print("Enter Withdraw amount:");
		int withdrawAmount=sc.nextInt();
		SavingsAccount s=new SavingsAccount();
		s.deposit(depositAmount);
		s.withdraw(withdrawAmount);
		s.calculateInterest();
		CurrentAccount c=new CurrentAccount();
		c.deposit(depositAmount);
		c.withdraw(withdrawAmount);
		c.calculateInterest();
	}
}
abstract class BankAccount{
	int amount,depositAmount,withdrawAmount,interestRate,interest,amtAfterInt;
	BankAccount(){
		amount=20000;
	}
	void deposit(int depositAmount){
		amount=amount+depositAmount;
		System.out.println("Balance:"+amount);
	}
	void withdraw(int withdrawAmount){
		amount=amount-withdrawAmount;
		System.out.println("Balance:"+amount);
	}
	abstract void calculateInterest();

}
class SavingsAccount extends BankAccount{
	SavingsAccount(){
		super();
		interestRate=5;
	}
	void calculateInterest(){
		interest=((amount*interestRate)/100);
		amtAfterInt=amount-interest;
		System.out.println("Amount After Interest:"+amtAfterInt);
	}
}
class CurrentAccount extends BankAccount{
	CurrentAccount(){
		super();
		interestRate=7;
	}
	void calculateInterest(){
		interest=((amount*interestRate)/100);
		amtAfterInt=amount-interest;
		System.out.println("Amount After Interest:"+amtAfterInt);
	}
}







