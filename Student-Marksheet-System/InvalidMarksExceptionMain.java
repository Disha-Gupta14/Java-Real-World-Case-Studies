//Create a user-defined exception named InvalidMarksException. Write a Java program to accept marks of a student. 
//If marks are less than 0 or greater than 100, throw the exception; otherwise, display the marks and corresponding result.
import java.util.Scanner;
import java.util.InputMismatchException;
public class InvalidMarksExceptionMain{
	public static void main(String args[]){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your marks:");
			int marks=sc.nextInt();
			Marks e1=new Marks(marks);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input Type");
		}
		finally{
			System.out.println("Program Ended!");
		}
	}
}
class InvalidMarksException extends RuntimeException{
	InvalidMarksException(String msg){
		super(msg);
		System.out.println(msg);
	}
}
class Marks{
	int marks;
	Marks(int marks) throws InvalidMarksException{
		if (marks<0 || marks>100){
			throw new InvalidMarksException("You entered invalid marks");
		}
		System.out.println("Your Marks:"+marks);
	}
}
