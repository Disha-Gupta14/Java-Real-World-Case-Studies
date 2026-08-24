//Write a Java program to calculate interest on savings.
import java.util.Scanner;
public class SavingAccountMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount of savings:");
		int amountOfSaving=sc.nextInt();
		System.out.print("Enter the rate of interest for savings:");
		int rateOfInterest=sc.nextInt();
		System.out.print("Enter the tenture for saving:");
		int tenureForSaving=sc.nextInt();
		SavingAccount s1=new SavingAccount(amountOfSaving,rateOfInterest,tenureForSaving);
		s1.InterestOnSaving();
	}
}

class SavingAccount{
	int amountOfSaving, rateOfInterest, tenureForSaving, interestOnSaving;
	public SavingAccount(int amountOfSaving, int rateOfInterest, int tenureForSaving){
		this.amountOfSaving=amountOfSaving;
		this.rateOfInterest=rateOfInterest;
		this.tenureForSaving=tenureForSaving;
	}
	public void InterestOnSaving(){
		interestOnSaving=((amountOfSaving*rateOfInterest)/100)*tenureForSaving;
		System.out.print("Interest for the given saving for the given tenure is:"+interestOnSaving);
	}
}

