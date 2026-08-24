//Write a java program to calculate painting cost of a room using class.
public class PaintingCostMain{
	public static void main(String[] args){
	PaintingCost p1=new PaintingCost();
	p1.Calculation();
	p1.DisplayCost();
	}
}

class PaintingCost{
	int paintableArea,totalCost,areaOfRoom,areaOfWindows,areaOfDoor,lenR,breR,heigR,lenD,breD;
	public PaintingCost(){
		paintableArea=0;
		totalCost=0;
		areaOfRoom=0;
		areaOfWindows=0;
		areaOfDoor=0;
		lenR=10;
		breR=15;
		heigR=10;
		lenD=6;
		breD=4;
	}
	public void Calculation(){
		areaOfRoom=(2*(lenR+breR)*heigR)+(lenR*breR);
		areaOfWindows= (5*5)+(4*4);
		areaOfDoor=lenD*breD;
		paintableArea= areaOfRoom-areaOfWindows-areaOfDoor;
		totalCost= paintableArea*40;
	}
	public void DisplayCost(){
		System.out.println("Area of windows:"+areaOfWindows);
		System.out.println("Area of door:"+areaOfDoor);
		System.out.println("Area of 4 walls and celing:"+areaOfRoom);
		System.out.println("Paintable Area:"+paintableArea);
		System.out.println("The Painting cost of the room is "+totalCost);
	}
}
