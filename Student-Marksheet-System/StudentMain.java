//Write a java program to display a student marksheet using class.
public class StudentMain{
	public static void main(String[]args){
		int a, b, c, d, e;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=Integer.parseInt(args[3]);
		e=Integer.parseInt(args[4]);
		Student s1=new Student(a,b,c,d,e);
		s1.Result();
		s1.Display();
	}
}
class Student{
	int a,b,c,d,e,totalMarks,percentage, division,rollNo;
	String result, name, collegeName;
	//Constructor
	public Student(int a,int b,int c,int d,int e){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		rollNo=5;
		name="Disha";
		collegeName="IIS";
		totalMarks=0;
		percentage=0;
		division=0;
		result="Fail";
	}
	//Percentage Calculation
	public String Result(){
		totalMarks=a+b+c+d+e;
		percentage= (totalMarks*100)/500;
		if (percentage>=90){
		division=1;
		}
		else if(percentage<90 && percentage>=80){
		division=2;
		}
		else if (percentage<80 && percentage>=50){
		division=3;
		}
		else{
		division=4;
		}

		if (division<4){
		result="Pass";
		}
		else{
		result="Fail";
		}
		return result;
		}
	//Display
	public void Display(){
		System.out.println("--------------------------------------------");
		System.out.println("|                    "+collegeName+"                   |");
		System.out.println("|Rollno:"+rollNo+"          Name:"+name+"              |");
		System.out.println("--------------------------------------------");
		System.out.println("|Subject       |Max(100)      |Marks       |");
		System.out.println("|English       |100           |"+a+"          |");
		System.out.println("|Maths         |100           |"+b+"          |");
		System.out.println("|Science       |100           |"+c+"          |");
		System.out.println("|IT            |100           |"+d+"          |");
		System.out.println("|Hindi         |100           |"+e+"          |");
		System.out.println("--------------------------------------------");
		System.out.println("|                  Total Marks:"+totalMarks+"         |");
		System.out.println("|Division:"+division+"       Result:"+result+"              |");
		System.out.println("--------------------------------------------");
	}
}
