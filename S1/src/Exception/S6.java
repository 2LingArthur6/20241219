package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S6 {
	public static void main(String[] args)
	    {
	        System.out.println("Please enter a string:");

	        try
	        {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String str = br.readLine();
	            System.out.println("The string you entered is: " + str);
	        }
	        catch(IOException e)
	        {
	            System.out.println("An error occurred during input");
	        }
	    }
	}

