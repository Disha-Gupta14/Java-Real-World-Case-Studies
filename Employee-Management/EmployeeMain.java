//Write a java program to display a employee reciept using class.
public class EmployeeMain{
	public static void main(String[]args){
		int bs=Integer.parseInt(args[0]);
		Employee e1=new Employee(bs);
		e1.SalaryCalculation();
		e1.Display();
	}
}
class Employee{
	int bs, da, hra, ma, ta, pf, total,netSalary,empId;
	String name,dept;
	public Employee(int bs){
		this.bs=bs;
		da=60;
		hra=30;
		ma=20;
		ta=15;
		pf=10;
		total=0;
		netSalary=0;
		empId=1004;
		name="Disha";
		dept="Accounts";
	}
	public void SalaryCalculation(){
		da= (bs*da)/100;
		hra= (bs*hra)/100;
		ma= (bs*ma)/100;
		ta= (bs*ta)/100;
		pf= (bs*pf)/100;
		total=bs+da+hra+ma+ta;
		netSalary= total-pf;
	}
	public void Display(){
		System.out.println("===================================================");
		System.out.println("|EmpId:"+empId+"     Name:"+name+"     Dept.:"+dept+"     |");
		System.out.println("===================================================");
		System.out.println("|Addition:                                DA:"+da+"|");
		System.out.println("|                                        HRA:"+hra+"|");
		System.out.println("|                                          MA:"+ma+"|");
		System.out.println("|                                          TA:"+ta+"|");
		System.out.println("---------------------------------------------------");
		System.out.println("|                                     Total:"+total+"|");
		System.out.println("---------------------------------------------------");
		System.out.println("|Deduction:                                PF:"+pf+"|");
		System.out.println("---------------------------------------------------");
		System.out.println("|                                 Net Salary:"+netSalary+"|");
		System.out.println("===================================================");
	}
}
