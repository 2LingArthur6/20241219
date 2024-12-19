package Exception;

public class S2 {

	public static void main(String[] args) {
		try {
			int[] test;
			test = new int[5];
			System.out.println("Assign a value to test[10]");
			test[10] = 80;
			System.out.println("Assign 80 to test[10]");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("It's out of range of the array");
		}
		System.out.println("It was successfully executed");
	}

}
