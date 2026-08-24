import java.util.Scanner;
public class PersonMain{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	//School Student Class
	SchoolStudent s1=new SchoolStudent();
	s1.acceptPersonDetails("Disha",15);
	s1.acceptStudentDetails(785543);
	s1.enterMarks();
	s1.calculation();
	s1.display();
	//College Student Class
	CollegeStudent s2=new CollegeStudent();
	s2.acceptPersonDetails("Disha",18);
	s2.acceptStudentDetails(250959);
	s2.enterMarks();
	s2.calculation();
	s2.display();
	//Teaching Class
	Teaching e1=new Teaching();
	e1.acceptPersonDetails("Disha",45);
	e1.acceptEmployeeDetails(3882);
	e1.calculation();
	e1.display();
	//Non Teaching Class
	NonTeaching e2=new NonTeaching();
	e2.acceptPersonDetails("Disha",34);
	e2.acceptEmployeeDetails(5583);
	e2.calculation();
	e2.display();
	}
}

class Person{
	int age;
	String name;
	public Person(){
		name="Unknown";
		age=0;
	}
	public void acceptPersonDetails(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void displayDetails(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	int rollno;
	public Student(){
		super();
		rollno=0;
	}
	public void acceptStudentDetails(int rollno){
		this.rollno=rollno;
	}
	public void displayDetails(){
		System.out.println("Name:"+super.name);
		System.out.println("Age:"+super.age);
		System.out.println("Roll No:"+rollno);
	}
}
class SchoolStudent extends Student{
	int Class,marks1, marks2, marks3, marks4, marks5, marks6, marks7;
	int marks8, marks9, totalMarks, percentage;
	public SchoolStudent(){
		super();
		Class=9;
	}
	public void enterMarks(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks for school student:");
		marks1=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks2=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks3=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks4=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks5=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks6=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks7=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks8=sc.nextInt();
		System.out.print("Enter marks for school student:");
		marks9=sc.nextInt();
	}
	public void calculation(){
		totalMarks=marks1+marks2+marks3+marks4+marks5+marks6+marks7+marks8+marks9;
		percentage=totalMarks/9;
	}
	public void display(){
		System.out.println("MARKSHEET OF A SCHOOL STUDENT");
		System.out.println("=========================================");
		System.out.println("|Name:"+super.name+"                             |");
		System.out.println("|Age:"+super.age+"                                 |");
		System.out.println("|Roll No:"+super.rollno+"                         |");
		System.out.println("|Class:"+Class+"                                |");
		System.out.println("=========================================");
		System.out.println("|Subject          |Marks                |");
		System.out.println("-----------------------------------------");
		System.out.println("|English          |"+marks1+"                   |");
		System.out.println("|Hindi            |"+marks2+"                   |");
		System.out.println("|Maths            |"+marks3+"                   |");
		System.out.println("|Biology          |"+marks4+"                   |");
		System.out.println("|Social Science   |"+marks5+"                   |");
		System.out.println("|Physics          |"+marks6+"                   |");
		System.out.println("|Chemistry        |"+marks7+"                   |");
		System.out.println("|Sanskrit         |"+marks8+"                   |");
		System.out.println("|IT               |"+marks9+"                   |");
		System.out.println("-----------------------------------------");
		System.out.println("|Total Marks      |"+totalMarks+"                  |");
		System.out.println("|Percentage       |"+percentage+"                   |");
		System.out.println("=========================================");
	}
}
class CollegeStudent extends Student{
	int marks1, marks2, marks3, marks4, marks5, totalMarks, percentage;
	String course;
	public CollegeStudent(){
		super();
		course="BCA";
	}
	public void enterMarks(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks for college student:");
		marks1=sc.nextInt();
		System.out.print("Enter marks for college student:");
		marks2=sc.nextInt();
		System.out.print("Enter marks for college student:");
		marks3=sc.nextInt();
		System.out.print("Enter marks for college student:");
		marks4=sc.nextInt();
		System.out.print("Enter marks for college student:");
		marks5=sc.nextInt();
	}
	public void calculation(){
		totalMarks=marks1+marks2+marks3+marks4+marks5;
		percentage=totalMarks/5;
	}
	public void display(){
		System.out.println("MARKSHEET OF A COLLEGE STUDENT");
		System.out.println("=========================================");
		System.out.println("|Name:"+super.name+"                             |");
		System.out.println("|Age:"+super.age+"                                 |");
		System.out.println("|Roll No:"+super.rollno+"                         |");
		System.out.println("|Course:"+course+"                             |");
		System.out.println("=========================================");
		System.out.println("|Subject          |Marks                |");
		System.out.println("-----------------------------------------");
		System.out.println("|English          |"+marks1+"                   |");
		System.out.println("|Hindi            |"+marks2+"                   |");
		System.out.println("|Maths            |"+marks3+"                   |");
		System.out.println("|Biology          |"+marks4+"                   |");
		System.out.println("|Social Science   |"+marks5+"                   |");
		System.out.println("-----------------------------------------");
		System.out.println("|Total Marks      |"+totalMarks+"                  |");
		System.out.println("|Percentage       |"+percentage+"                   |");
		System.out.println("=========================================");
	}
}
class Employee extends Person{
	int empId;
	public Employee(){
		super();
		empId=0000;
	}
	public void acceptEmployeeDetails(int empId){
		this.empId=empId;
	}
	public void displayDetails(){
		System.out.println("Name:"+super.name);
		System.out.println("Age:"+super.age);
		System.out.println("Employee Id:"+empId);
	}
}
class Teaching extends Employee{
	int salary,hra,pf;
	public Teaching(){
		super();
		salary=20000;
		hra=500;
		pf=200;
	}
	public void calculation(){
		salary=salary+hra-pf;
	}
	public void display(){
		System.out.println("SALARY OF A TEACHING EMPLOYEE");
		System.out.println("=========================================");
		System.out.println("|Name:"+super.name+"                             |");
		System.out.println("|Age:"+super.age+"                                 |");
		System.out.println("|Employee Id:"+empId+"                       |");
		System.out.println("-----------------------------------------");
		System.out.println("|Salary:                           "+salary+"|");
		System.out.println("=========================================");
	}
}
class NonTeaching extends Employee{
	int salary;
	public NonTeaching(){
		super();
		salary=500;
	}
	public void calculation(){
		salary=salary*30;
	}
	public void display(){
		System.out.println("SALARY OF A NON TEACHING EMPLOYEE");
		System.out.println("=========================================");
		System.out.println("|Name:"+super.name+"                             |");
		System.out.println("|Age:"+super.age+"                                 |");
		System.out.println("|Employee Id:"+empId+"                       |");
		System.out.println("-----------------------------------------");
		System.out.println("|Salary:                           "+salary+"|");
		System.out.println("=========================================");
	}
}