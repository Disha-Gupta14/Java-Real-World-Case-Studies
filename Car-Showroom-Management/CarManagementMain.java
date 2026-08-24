//Write a java program to manage a car showroom using constructors.
import java.util.Scanner;
public class CarManagementMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Car Company:");
		String carCompany=sc.next();
		System.out.print("Enter Car Model:");
		String model=sc.next();
		System.out.print("Enter Car Fuel Type:");
		String fuelType=sc.next();
		System.out.print("Enter Car Price:");
		double price=sc.nextDouble();
		CarManagement c2=new CarManagement();
		System.out.println("Default Constructor");
		c2.display();
		CarManagement c3=new CarManagement(carCompany, model);
		System.out.println("Parameterized(2 variables) Constructor");
		c3.display();
		CarManagement c1=new CarManagement(carCompany, model, fuelType, price);
		System.out.println("Parameterized Constructor");
		c1.display();
	}
}

class CarManagement{
	double price;
	String carCompany, model, fuelType;
	CarManagement(){}

	public CarManagement(String carCompany, String model){
		this.carCompany=carCompany;
		this.model=model;
	}
	public CarManagement(String carCompany, String model, String fuelType, double price){
		this.carCompany=carCompany;
		this.model=model;
		this.fuelType=fuelType;
		this.price=price;
	}
	public void display(){
		System.out.println("+=============================================================+");
		System.out.println("|Car Company  | Model            | Fuel Type    | Price       |");
		System.out.println("|=============================================================|");
		System.out.println("|"+carCompany+"         | "+model+"            | "+fuelType+"       | "+price+"    |");
		System.out.println("|=============================================================|");
	 }
 }

