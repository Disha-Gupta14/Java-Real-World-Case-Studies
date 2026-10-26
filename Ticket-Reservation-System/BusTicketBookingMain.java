//Write a Java program to simulate a railway/bus ticket reservation system. 
//Create multiple threads attempting to book tickets from a limited number of available seats. 
//Use the synchronized keyword to prevent two threads from booking the same seat.
public class BusTicketBookingMain{
	public static void main(String args[]){
		BusTicketBooking b=new BusTicketBooking();
		int i=1;
		BookingThread b1=new BookingThread(b,i);
		b1.start();
		BookingThread b2=new BookingThread(b,++i);
		b2.start();
		BookingThread b3=new BookingThread(b,++i);
		b3.start();
		BookingThread b4=new BookingThread(b,++i);
		b4.start();
	}
}
class BusTicketBooking{
	int availableSeat;
	BusTicketBooking(){
		availableSeat=3;
	}
	public synchronized void Booking(){
		if (availableSeat>0){
			availableSeat--;
			System.out.println("Seat Booked and Seat Left"+availableSeat);
		}
		else{
			System.out.println("Seat Already Booked");
		}
	}
}
class BookingThread extends Thread{
	BusTicketBooking b;
	int i;
	BookingThread(BusTicketBooking b, int i){
		this.b=b;
		this.i=i;
	}
	public void run(){
		System.out.println("Thread "+i+" is running..");
		b.Booking();
	}
}
