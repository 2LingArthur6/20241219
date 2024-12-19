public class s1 {
	    public static void main(String[] args) {
	        // Using the Object class (the most basic class)
	        Object obj = new Object();
	        System.out.println("Hash code of the Object: " + obj.hashCode());
	        System.out.println("String representation of the Object: " + obj.toString());

	        // Using the String class
	        String greeting = "Hello, World!";
	        System.out.println("String content: " + greeting);
	        System.out.println("String length: " + greeting.length());
	        System.out.println("String in uppercase: " + greeting.toUpperCase());

	        // Using the Math class
	        int number = -42;
	        System.out.println("Absolute value: " + Math.abs(number));
	        System.out.println("Square root: " + Math.sqrt(16));
	        System.out.println("Maximum value: " + Math.max(10, 20));

	        // Using the Integer class (wrapper for primitive type)
	        Integer num = Integer.valueOf(100);
	        System.out.println("Value of Integer: " + num);
	        System.out.println("Converted to binary string: " + Integer.toBinaryString(num));

	        // Using the Thread class (example of multithreading)
	        Thread thread = new Thread(() -> {
	            System.out.println("Thread has started!");
	        });
	        thread.start();

	        // Using the System class
	        System.out.println("Current time (in milliseconds): " + System.currentTimeMillis());
	        System.out.println("Java version: " + System.getProperty("java.version"));

	        // Using the Class class
	        Class<?> clazz = greeting.getClass();
	        System.out.println("Object type: " + clazz.getName());
	    }
	    
	}
