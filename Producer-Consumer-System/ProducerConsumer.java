//Implement a simple producer-consumer program using two threads and a shared buffer. 
//Demonstrate thread synchronization using wait() and notify().
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}
class Buffer {
    int value;
    boolean available = false;
    synchronized void produce(int n){
		try{
            while (available){
                wait();
			}
            value = n;
            available = true;
            System.out.println("Produced: " + n);
            notify();
		}
		catch(InterruptedException e){
		}
    }

    synchronized void consume(){
		try{
            while (!available){
                wait();
			}
            System.out.println("Consumed: " + value);
            available = false;
            notify();
        }
		catch(InterruptedException e){
		}
    }
}

class Producer extends Thread {
    Buffer b;
    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            b.produce(i);
    }
}

class Consumer extends Thread {
    Buffer b;
    Consumer(Buffer b) {
        this.b = b;
    }
    public void run() {
        for (int i = 1; i <= 5; i++)
            b.consume();
    }
}

