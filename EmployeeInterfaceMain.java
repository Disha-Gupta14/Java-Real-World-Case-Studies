//Write a Java program to create an interface Employee with methods for salary and leave calculation, having child classes Teaching, 
//Non-Teaching and Adobe with their respective salary components. Implement leave deductions based on late marks and annual leaves as
//given for each employee type.
import java.util.Scanner;
public class EmployeeInterfaceMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of leaves:");
		final int late=sc.nextInt();
		Teaching e1=new Teaching();
		e1.salaryCalculation(late);
		NonTeaching e2=new NonTeaching();
		e2.salaryCalculation(late);
		Adobe e3=new Adobe();
		e3.salaryCalculation(late);
	}
}
interface EmployeeInterface{
	public void salaryCalculation(int late);
	public int leaveCalculation(final int late);
}
class Teaching implements EmployeeInterface{
	final int basicSalary=37000;
	int da=70,medical=15,pf=15,noOfLeave,late,salaryPerDay,deductSalary,reduceSalary,netSalary;
	public int leaveCalculation(final int late){
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
class NonTeaching implements EmployeeInterface{
	final int basicSalary=20000;
	int da=50,medical=10,pf=10,noOfLeave,late,salaryPerDay,deductSalary,reduceSalary,netSalary;
	public int leaveCalculation(final int late){
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
class Adobe implements EmployeeInterface{
	final int basicSalary=25000;
	int transport=10,late,salaryPerDay,deductSalary,reduceSalary,netSalary;
	public int leaveCalculation(final int late){
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




