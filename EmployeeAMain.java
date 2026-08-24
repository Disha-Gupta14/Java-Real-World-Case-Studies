import java.util.Scanner;
public class EmployeeAMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of leaves:");
		int late=sc.nextInt();
		Teaching e1=new Teaching();
		e1.salaryCalculation(late);
		NonTeaching e2=new NonTeaching();
		e2.salaryCalculation(late);
		Adobe e3=new Adobe();
		e3.salaryCalculation(late);
	}
}
abstract class EmployeeA{
	public void salaryCalculation(){}
	public int leaveCalculation(){return 0;}
}
class Teaching extends EmployeeA{
	int basicSalary,da,medical,pf,noOfLeave,late,salaryPerDay,deductSalary,reduceSalary,netSalary;
	Teaching(){
		basicSalary=37000;
		da=70;
		medical=15;
		pf=15;
	}
	public int leaveCalculation(int late){
		this.late=late;
		if (late>=3){
			noOfLeave=late/3;
			salaryPerDay=basicSalary/30;
			deductSalary=salaryPerDay*noOfLeave;
			return deductSalary;
		}
		else{
			deductSalary=0;
		}
		return 0;
	}
	public void salaryCalculation(int late){
		reduceSalary=leaveCalculation(late);
		da=(da*basicSalary)/100;
		medical=(medical*basicSalary)/100;
		pf=(pf*basicSalary)/100;
		netSalary=basicSalary+da+medical-pf-reduceSalary;
		System.out.println("Teaching Employee Salary:"+netSalary);

	}
}
class NonTeaching extends EmployeeA{
	int basicSalary,da,medical,pf,noOfLeave,late,salaryPerDay,deductSalary,reduceSalary,netSalary;
	NonTeaching(){
		basicSalary=20000;
		da=50;
		medical=10;
		pf=10;
	}
	public int leaveCalculation(int late){
		this.late=late;
		if (late>=2){
			noOfLeave=late/2;
			salaryPerDay=basicSalary/30;
			deductSalary=salaryPerDay*noOfLeave;
			return deductSalary;
		}
		else{
			deductSalary=0;
		}
		return 0;
	}
	public void salaryCalculation(int late){
		reduceSalary=leaveCalculation(late);
		da=(da*basicSalary)/100;
		medical=(medical*basicSalary)/100;
		pf=(pf*basicSalary)/100;
		netSalary=basicSalary+da+medical-pf-reduceSalary;
		System.out.println("Non-Teaching Employee Salary:"+netSalary);

	}
}
class Adobe extends EmployeeA{
	int basicSalary,transport,late,salaryPerDay,deductSalary,reduceSalary,netSalary;
	Adobe(){
		basicSalary=25000;
		transport=10;
	}
	public int leaveCalculation(int late){
		this.late=late;
		if (late>=1){
			salaryPerDay=(basicSalary/30)/2;
			deductSalary=salaryPerDay*late;
			return deductSalary;
		}
		else{
			deductSalary=0;
		}
		return 0;
	}
	public void salaryCalculation(int late){
		reduceSalary=leaveCalculation(late);
		transport=(transport*basicSalary)/100;
		netSalary=basicSalary+transport-reduceSalary;
		System.out.println("Adobe Employee Salary:"+netSalary);

	}
}




