//Create an interface Payment having methods makePayment() and displayPaymentDetails(). 
//Implement it using classes CreditCardPayment, UPIPayment, and NetBankingPayment.
//Write a Java program to demonstrate interface implementation and runtime polymorphism.

import java.util.Scanner;
public class InterfaceBasedPaymentSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount:");
		int amount=sc.nextInt();
		CreditCardPayment c=new CreditCardPayment(amount);
		c.makePayment();
		c.displayPaymentDetails();
		System.out.println();
		UPIPayment u=new UPIPayment(amount);
		u.makePayment();
		u.displayPaymentDetails();
		System.out.println();
		NetBankingPayment n=new NetBankingPayment(amount);
		n.makePayment();
		n.displayPaymentDetails();
		System.out.println();
	}
}
interface Payment{
	public void makePayment();
	public void displayPaymentDetails();
}
class CreditCardPayment implements Payment{
	int amount;
	CreditCardPayment(int amount){
		this.amount=amount;
	}
	public void makePayment(){
		System.out.println("Payment made using Credit Card.");
	}
	public void displayPaymentDetails(){
		System.out.println("Amount Paid using Credit Card:"+amount);
	}
}
class UPIPayment implements Payment{
	int amount;
	UPIPayment(int amount){
		this.amount=amount;
	}
	public void makePayment(){
		System.out.println("Payment made using UPI.");
	}
	public void displayPaymentDetails(){
		System.out.println("Amount Paid using UPI:"+amount);
	}
}
class NetBankingPayment implements Payment{
	int amount;
	NetBankingPayment(int amount){
		this.amount=amount;
	}
	public void makePayment(){
		System.out.println("Payment made using Net Banking.");
	}
	public void displayPaymentDetails(){
		System.out.println("Amount Paid using Net Banking:"+amount);
	}
}