package Exception;

public class S13 {
	public static void main(String[] args) {
	        Car car1 = new Car("Car 1");
	        car1.start();
	        
	        for(int i = 0; i < 5; i++) {
	            try {
	                Thread.sleep(1000); // Pause for 1 second
	                System.out.println("Processing main()'s work");
	            } catch (InterruptedException e) {
	                // Exception handling
	            }
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
	            System.out.println("Processing " + name + "'s work");
	        }
	    }
	}
