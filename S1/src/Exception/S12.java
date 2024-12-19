package Exception;

public class S12 {
	    public static void main(String[] args) {
	        Car car1 = new Car("Car 1");
	        car1.start();

	        for(int i = 0; i < 5; i++) {
	            System.out.println("Processing main() task");
	        }
	    }
	}

	class Car extends Thread {
	    private String name;

	    public Car(String nm) {
	        name = nm;
	    }

	    public void run() {
	        for(int i = 0; i < 5; i++) {
	            try {
	                sleep(1000);
	                System.out.println("Processing " + name + " task");
	            } catch (InterruptedException e) {
	            }
	        }
	    }
	}
