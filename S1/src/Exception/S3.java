package Exception;

public class S3 {

	public static void main(String[] args) {
		try {
			int[] test;
		    test = new int[5];
		    System.out.println("Assigning value to test[10]");
		    test[10] = 80;
		    System.out.println("Assigned 80 to test[10]");
		    }
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Index out of bounds");
		    }
		finally {
		    System.out.println("This will always be executed");
		        }
		    System.out.println("Executed successfully");
		    }
	}