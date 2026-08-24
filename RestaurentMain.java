import java.util.Scanner;
public class RestaurentMain{
	public static void main(String[] args){
	Restaurent r1=new Restaurent();
	r1.calculation();
	r1.display();
	}
}
class Restaurent{
	int tea,milk,sugar,coffee,addItemCost,totalCost,cost;
	String option,choice;
	Scanner sc=new Scanner(System.in);
	public Restaurent(){
		tea=5;
		milk=5;
		sugar=2;
		coffee=8;
		addItemCost=0;
		totalCost=0;
		cost=0;
	}
	public void calculation(){
		System.out.print("Choose from the following:\n1.Tea\n2.Coffee\n");
		System.out.print("Enter choice:");
		choice=sc.next();
		switch(choice){
			case "Tea":
				System.out.print("Choose from the following:\n1.Milk+Sugar\n2.Sugar\n3.Milk\n4.Tea\n");
				System.out.print("Enter choice:");
				option=sc.next();
				if (option.equals("Milk+Sugar")){
					addItemCost=milk+sugar;
				}
				else if (option.equals("Sugar")){
					addItemCost=sugar;
				}
				else if (option.equals("Milk")){
					addItemCost=milk;
				}
				else{
					addItemCost=0;
				}
				break;
			case "Coffee":
				System.out.print("Choose from the following:\n1.Sugar+Milk\n2.Sugar\n3.Milk\n4.Coffee\n");
				System.out.print("Enter choice:");
				option=sc.next();
				if (option.equals("Sugar+Milk")){
					addItemCost=milk+sugar;
				}
				else if (option.equals("Sugar")){
					addItemCost=sugar;
				}
				else if (option.equals("Milk")){
					addItemCost=milk;
				}
				else{
					addItemCost=0;
				}
				break;
			default:
				System.out.print("Invalid");
			}
			if (choice.equals("Coffee")){
				cost=coffee;
			}
			else{
				cost=tea;
			}
			if (choice.equals("Coffee")){
				totalCost=addItemCost+coffee;
			}
			else{
				totalCost=addItemCost+tea;
			}
		}
	public void display(){
		System.out.print("Enter Name:");
		String name=sc.next();
		System.out.print("Enter Date:");
		String date=sc.next();
		System.out.println("              +================================================+");
		System.out.println("              |Name:"+name+"             Date:"+date+"          |");
		System.out.println("              +================================================+");
		System.out.println("              |Sno.          | Item Name        |  Price       |");
		System.out.println("              |1.            |"  +choice+"            |"+cost+"             |");
		System.out.println("              +------------------------------------------------+");
		System.out.println("              |Addition Item                    |"+addItemCost+"             |");
		System.out.println("              +------------------------------------------------+");
		System.out.println("              |Total Cost                       |"+totalCost+"            |");
		System.out.println("              +================================================+");
	}
}
