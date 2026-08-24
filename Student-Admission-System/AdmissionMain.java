//Write a java program to create a student admission system using constructors.
import java.util.Scanner;
public class AdmissionMain{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter roll no:");
	int rollNo=sc.nextInt();
	System.out.print("Enter semester:");
	int semester=sc.nextInt();
	System.out.print("Enter fees:");
	int fees=sc.nextInt();
	System.out.print("Enter fees paid:");
	int paidFees=sc.nextInt();
	System.out.print("Enter name:");
	String name=sc.next();
	System.out.print("Enter course:");
	String course=sc.next();
	System.out.println("Default Constructor:");
	Admission a1=new Admission();
	a1.displayStudent();
	a1.calculateRemainingFees();
	System.out.println("Parameterised(only name) Constructor:");
	Admission a2=new Admission(name);
	a2.displayStudent();
	a2.calculateRemainingFees();
	System.out.println("Parameterised(name and course) Constructor:");
	Admission a3=new Admission(name,course);
	a3.displayStudent();
	a3.calculateRemainingFees();
	System.out.println("Parameterised Constructor:");
	Admission a4=new Admission(rollNo,semester,fees,paidFees,name,course);
	a4.displayStudent();
	a4.calculateRemainingFees();
	}
}
class Admission{
	int rollNo, semester, fees, paidFees, remainingFees;
	String name, course;
	Admission(){}
	public Admission(String name){
		this.name=name;
	}
	public Admission(String name, String course){
		this.name=name;
		this.course=course;
	}
	public Admission(int rollNo, int semester, int fees,int paidFees, String name, String course){
		this.rollNo=rollNo;
		this.semester=semester;
		this.fees=fees;
		this.name=name;
		this.course=course;
		this.paidFees=paidFees;
		remainingFees=0;
	}
	public void displayStudent(){
		System.out.println("________________________________________________________________________");
		System.out.println("|Roll no   |Name           |Course        |Semester      |Fees          |");
		System.out.println("|__________|_______________|______________|______________|______________|");
		System.out.println("|"+rollNo+"        |"+name+"          |"+course+"           |"+semester+"             |"+fees+"        |");
		System.out.println("|__________|_______________|______________|______________|______________|");
	}
	public void calculateRemainingFees(){
		remainingFees=fees-paidFees;
		System.out.println("Remaining Fees of the student named "+name+" is "+remainingFees);
	}
}
