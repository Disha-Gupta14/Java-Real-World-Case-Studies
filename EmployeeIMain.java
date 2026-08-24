import java.util.Scanner;
public class EmployeeIMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Manager m1=new Manager();
		System.out.print("Enter Employee Id:");
		int empId=sc.nextInt();
		System.out.print("Enter Name:");
		String name=sc.next();
		System.out.print("Enter salary:");
		double salary=sc.nextDouble();
		m1.acceptDetails(empId,name,salary);
		m1.calculateSalary();
		System.out.print("Enter Department:");
		String department=sc.next();
		m1.displayDetails(department);
	}
}

class EmployeeI{
	int empId;
	String name;
	double salary;
	public void acceptDetails(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public void calculateSalary(){
		salary=salary*12;
	}
	public void displayDetails(){
		System.out.println("Employee Id:"+empId);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
}
class Manager extends EmployeeI{
	double bonus,totalSalary;
	String department;
	Manager(){
		super();
		bonus=1000.0;
		department="Unknown";
	}
	public void calculateSalary(){
		totalSalary=salary+bonus;
	}
	public void displayDetails(String department){
		System.out.println("Employee Id:"+super.empId);
		System.out.println("Name:"+super.name);
		System.out.println("Salary:"+super.salary);
		this.department=department;
		System.out.println("Department:"+department);
		System.out.println("bonus:"+bonus);
		System.out.println("Salary after Bonus:"+totalSalary);
	}
}


