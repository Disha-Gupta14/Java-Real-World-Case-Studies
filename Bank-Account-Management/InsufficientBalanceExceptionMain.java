//Create a BankAccount class with a withdraw() method. Create a user-defined exception InsufficientBalanceException. 
//The exception should be generated when the withdrawal amount exceeds the available balance.
import java.util.Scanner;
public class InsufficientBalanceExceptionMain{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter withdraw amount:");
		int withdrawAmount=sc.nextInt();
		BankAccount e1=new BankAccount(withdrawAmount);
	}
}
class InsufficientBalanceException extends RuntimeException{
	InsufficientBalanceException(String msg){
		super(msg);
		System.out.println(msg);
	}
}
class BankAccount{
	int withdrawAmount,balance;
	BankAccount(int withdrawAmount) throws InsufficientBalanceException{
		balance=2000;
		this.withdrawAmount=withdrawAmount;
		if (withdrawAmount>balance){
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		System.out.println("Available Balance:"+(balance-withdrawAmount));
	}
}




