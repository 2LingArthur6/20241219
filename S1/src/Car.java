public class Car {
	private int num;
	private double gas;

public Car(){
	num = 0;
	gas = 0.0;
	System.out.println("The car has been produced");
}

public void setCar(int n, double g){
	num = n;
	gas = g;
	System.out.println("Set the car number to" + num + "Set the amount of gas to" + gas);
}

public void show(){
	System.out.println("The car number is" + num);
	System.out.println("The amount of gas is" + gas);
	    }
	}
