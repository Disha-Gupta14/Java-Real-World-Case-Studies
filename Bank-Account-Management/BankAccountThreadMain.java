//Create a BankAccount class with a withdraw() method. 
//Create multiple threads attempting to withdraw money from the same account.
//Use the synchronized keyword to ensure that two threads cannot modify the account balance simultaneously.
public class BankAccountThreadMain{
	public static void main(String args[]){
		BankAccount account=new BankAccount();
		Withdraw w1=new Withdraw(account, 5000);
		Withdraw w2=new Withdraw(account, 3000);
		w1.start();
		w2.start();
	}
}
class BankAccount{
	int balance,withdrawAmount;
	BankAccount(){
		balance=10000;
	}
	public synchronized void withdraw(int withdrawAmount){
		this.withdrawAmount=withdrawAmount;
		balance-=withdrawAmount;
		System.out.println("Balance after Deposit:"+balance);
	}
}
class Withdraw extends Thread{
	BankAccount account;
	int withdrawAmount;
	Withdraw(BankAccount account, int withdrawAmount){
		this.account=account;
		this.withdrawAmount=withdrawAmount;
	}
	public void run(){
		account.withdraw(withdrawAmount);
	}
}





