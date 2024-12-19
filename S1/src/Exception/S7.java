package Exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class S7 {
	public static void main(String[] args)
	    {
	        try
	       {
	            FileWriter fw = new FileWriter("test1.txt");
	            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

	            pw.println("Hello!");
	            pw.println("Goodbye!");

	            pw.close();
	            System.out.println("Data has been written to the file");
	        }
	        catch(IOException e)
	        {
	            System.out.println("Input/output error");
	        }
	    }
	}
