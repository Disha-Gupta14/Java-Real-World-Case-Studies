//Write a Java program to simulate railway ticket booking using two threads. 
//Use synchronization so that the same seat cannot be booked by both threads.
public class RailwayTicketBookingMain{
	public static void main(String args[]){
		RailwayTicketBooking rb=new RailwayTicketBooking();
		int i=1;
		BookingThread b1=new BookingThread(rb,i);
		++i;
		BookingThread b2=new BookingThread(rb,i);
		b1.start();
		b2.start();
	}
}
class RailwayTicketBooking{
	int seat;
	RailwayTicketBooking(){
		seat=1;
	}
	public synchronized void Booking(){
		if (seat>0){
			seat--;
			System.out.println("Seat Booked");
		}
		else{
			System.out.println("Seat Already Booked");
		}
	}
}
class BookingThread extends Thread{
	RailwayTicketBooking rb;
	int i;
	BookingThread(RailwayTicketBooking rb, int i){
		this.rb=rb;
		this.i=i;
	}
	public void run(){
		System.out.print("Thread "+i+" is running..");
		rb.Booking();
	}
}






