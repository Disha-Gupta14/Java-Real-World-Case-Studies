//Write a Java Applet program to calculate and display an employee’s Net Salary with employee details and salary components.
import java.applet.*;
import java.awt.*;
/* <applet code="NetSalaryRuntimeApplet" width=400 height=200>
	</applet>
*/
public class NetSalaryRuntimeApplet extends Applet{
	int BS, DA, HRA, MA, TA, PF, Total,NetSalary,empId;
	String Name,Dept, msg;
	public void init(){
		BS=25000;
		DA=60;
		HRA=30;
		MA=20;
		TA=15;
		PF=10;
		empId=Integer.parseInt(getParameter("empId"));
		Name=getParameter("name");
		Dept=getParameter("dept");
		setBackground(Color.black);
		setForeground(Color.white);
		msg="Inside Init()--";
	}
	public void start(){
		msg+="Inside Start()--";
	}
	public void paint(Graphics g){
		g.drawString(msg,100,60);
		DA= (BS*DA)/100;
		HRA= (BS*HRA)/100;
		MA= (BS*MA)/100;
		TA= (BS*TA)/100;
		PF= (BS*PF)/100;
		Total=BS+DA+HRA+MA+TA;
		NetSalary= Total-PF;
		g.drawString("======================================",100,70);
		g.drawString("|EmpId:"+empId+"     Name:"+Name+"     Dept.:"+Dept+"   |",100,80);
		g.drawString("======================================",100,90);
		g.drawString("|Addition:                                                     DA:"+DA+"|",100,100);
		g.drawString("|                                                                    HRA:"+HRA+"|",100,110);
		g.drawString("|                                                                       MA:"+MA+"|",100,120);
		g.drawString("|                                                                        TA:"+TA+"|",100,130);
		g.drawString("-------------------------------------------------------------------",100,140);
		g.drawString("|                                                                 Total:"+Total+"|",100,150);
		g.drawString("-------------------------------------------------------------------",100,160);
		g.drawString("|Deduction:                                                    PF:"+PF+"|",100,170);
		g.drawString("-------------------------------------------------------------------",100,180);
		g.drawString("|                                                       Net Salary:"+NetSalary+"|",100,190);
		g.drawString("======================================",100,200);
		showStatus("Inside paint()--");
	}
}
