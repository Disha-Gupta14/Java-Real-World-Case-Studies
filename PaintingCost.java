public class PaintingCost{
	public static void main(String[] args){
		int PaintableArea,TotalCost, AreaOfRoom, AreaOfWindows, AreaOfDoor,LenR=10, BreR=15,HeigR=10, LenD=6, BreD=4;
		AreaOfRoom=(2*(LenR+BreR)*HeigR)+(LenR*BreR);
		AreaOfWindows= (5*5)+(4*4);
		AreaOfDoor=LenD*BreD;
		PaintableArea= AreaOfRoom-AreaOfWindows-AreaOfDoor;
		TotalCost= PaintableArea*40;
		System.out.println("Area of windows:"+AreaOfWindows);
		System.out.println("Area of door:"+AreaOfDoor);
		System.out.println("Area of 4 walls and celing:"+AreaOfRoom);
		System.out.println("Paintable Area:"+PaintableArea);
		System.out.println("The Painting cost of the room is "+TotalCost);
	}
}
