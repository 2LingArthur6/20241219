package Exception;

public class S5 {
	public static void main(String[] args) {
	        Car car1;
	        car1 = new Car();

	        try {
	            car1.setCar(1234, -10.0);
	        }
	        catch (CarException e) {
	            System.out.println("Exception thrown: " + e);
	        }

	        car1.show();
	    }
}

class CarException extends Exception
{
}

class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("Car has been produced");
    }

    public void setCar(int n, double g) throws CarException
    {
        if (g < 0)
        {
            CarException e = new CarException();
            throw e;
        }
        else
        {
            num = n;
            gas = g;
            System.out.println("Set car number to " + num + ", set gas amount to " + gas);
        }
    }

    public void show()
    {
        System.out.println("Car number is " + num);
        System.out.println("Gas amount is " + gas);
    }
}