//Create an abstract class Employee containing:
//name
//id
//an abstract method calculateSalary()
//a concrete method displayDetails()
//Create two subclasses:
//PermanentEmployee
//ContractEmployee
//Override calculateSalary() in both classes using different salary-calculation rules. 
//Create objects and display the employee details and calculated salary.

import java.util.Scanner;
public class EmployeeSalaryCalculation{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=sc.next();
		System.out.print("Enter id:");
		int id=sc.nextInt();
		PermanentEmployee p=new PermanentEmployee(name,id);
		p.calculateSalary();
		p.displayDetails();
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter id:");
		id=sc.nextInt();
		ContractEmployee c=new ContractEmployee(name,id);
		c.calculateSalary();
		c.displayDetails();
	}
}
abstract class Employee{
	String name;
	int id,salary;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	abstract void calculateSalary();
	void displayDetails(){
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
}
class PermanentEmployee extends Employee{
	int basicSalary,da,pf;
	PermanentEmployee(String name,int id){
		super(name,id);
		basicSalary=20000;
		da=5;
		pf=2;
	}
	void calculateSalary(){
		da=((basicSalary*da)/100);
		pf=((basicSalary*pf)/100);
		salary=basicSalary+da-pf;
	}
}
class ContractEmployee extends Employee{
	int basicSalary,days;
	ContractEmployee(String name,int id){
		super(name,id);
		basicSalary=100;
		days=30;
	}
	void calculateSalary(){
		salary=basicSalary*days;
	}
}


