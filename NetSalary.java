public class NetSalary{
	public static void main(String[]args){
		int BS, DA, HRA, MA, TA, PF, Total,NetSalary,empId;
		String Name,Dept;
		BS=Integer.parseInt(args[0]);
		DA=60;
		HRA=30;
		MA=20;
		TA=15;
		PF=10;
		DA= (BS*DA)/100;
		HRA= (BS*HRA)/100;
		MA= (BS*MA)/100;
		TA= (BS*TA)/100;
		PF= (BS*PF)/100;
		Total=BS+DA+HRA+MA+TA;
		NetSalary= Total-PF;
		empId=Integer.parseInt(args[1]);
		Name=args[2];
		Dept=args[3];
		System.out.println("===================================================");
		System.out.println("|EmpId:"+empId+"     Name:"+Name+"     Dept.:"+Dept+"     |");
		System.out.println("===================================================");
		System.out.println("|Addition:                                DA:"+DA+"|");
		System.out.println("|                                        HRA:"+HRA+"|");
		System.out.println("|                                          MA:"+MA+"|");
		System.out.println("|                                          TA:"+TA+"|");
		System.out.println("---------------------------------------------------");
		System.out.println("|                                      Total:"+Total+"|");
		System.out.println("---------------------------------------------------");
		System.out.println("|Deduction:                                PF:"+PF+"|");
		System.out.println("---------------------------------------------------");
		System.out.println("|                                 Net Salary:"+NetSalary+"|");
		System.out.println("===================================================");
	}
}
