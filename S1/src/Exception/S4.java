package Exception;

public class S4 {
	public static void main (String[] args)
	    {
	        try
	        {
	            int[] test;
	            test = new int[5];

	            System.out.println("Assigning value to test[10]");
	            test[10] = 80;
	            System.out.println("Assigned 80 to test[10]");
	        }
	        catch (ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("An exception " + e + " occurred");
	        }
	        finally
	        {
	            System.out.println("This block will always execute");
	        }
	        System.out.println("This command will execute after the finally block");
	    }
	}
