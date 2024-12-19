package Exception;

public class S14 {
	public static void main(String[] args) {
	    Car car1 = new Car("1 Car");
	    car1.start();
	    try {
	        car1.join();
	    } catch (InterruptedException e) {
	    }
	    System.out.println("This is the last task of main().");
	}

	class Car extends Thread {
	    private String name;
	    public Car(String nm) {
	        name = nm;
	    }
	    public void run() {
	        for(int i=0; i<5; i++) {
	            System.out.println("Running: " + name + " car");
	        }
	    }
	}

}
