//Create a user-defined exception named InvalidAgeException.
//Write a Java program that accepts a person's age and throws the exception if the age is less than 18. 
//Otherwise, display "Eligible for Voting".
import java.util.Scanner;
public class InvalidAgeExceptionMain{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Age:");
		int age=sc.nextInt();
		EligibilityForVoting e1=new EligibilityForVoting(age);
	}
}
class InvalidAgeException extends RuntimeException{
	InvalidAgeException(String msg){
		super(msg);
		System.out.println(msg);
	}
}
class EligibilityForVoting{
	int age;
	EligibilityForVoting(int age) throws InvalidAgeException{
		if (age<18){
			throw new InvalidAgeException("You are not eligible for voting!");
		}
		System.out.println("You are eligible for voting!");
	}
}




