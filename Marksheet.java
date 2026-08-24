public class Marksheet{
	public static void main(String[]args){
		int a,b,c,d,e,TotalMarks,Percentage, Division,Rollno;
		String Result, Name, CollegeName;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=Integer.parseInt(args[3]);
		e=Integer.parseInt(args[4]);
		TotalMarks=a+b+c+d+e;
		Percentage= (TotalMarks*100)/500;
		if (Percentage>=90){
			Division=1;
			}
		else if(Percentage<90 && Percentage>=80){
			Division=2;
			}
		else if (Percentage<80 && Percentage>=50){
			Division=3;
			}
		else{
			Division=4;
			}
		Rollno=Integer.parseInt(args[5]);
		Name=args[6];
		CollegeName=args[7];
		if (Division<4){
			Result="Pass";
			}
		else{
			Result="Fail";
			}
		System.out.println("--------------------------------------------");
		System.out.println("|                    "+CollegeName+"                   |");
		System.out.println("|Rollno:"+Rollno+"          Name:"+Name+"              |");
		System.out.println("--------------------------------------------");
		System.out.println("|Subject       |Max(100)      |Marks       |");
		System.out.println("|English       |100           |"+a+"          |");
		System.out.println("|Maths         |100           |"+b+"          |");
		System.out.println("|Science       |100           |"+c+"          |");
		System.out.println("|IT            |100           |"+d+"          |");
		System.out.println("|Hindi         |100           |"+e+"          |");
		System.out.println("--------------------------------------------");
		System.out.println("|                  Total Marks:"+TotalMarks+"         |");
		System.out.println("|Division:"+Division+"       Result:"+Result+"              |");
		System.out.println("--------------------------------------------");
	}
}