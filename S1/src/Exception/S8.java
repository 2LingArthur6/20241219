package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class S8 {
	public static void main(String[] args) {
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
	            String str1 = br.readLine();
	            String str2 = br.readLine();
	            System.out.println("The string of the first line of data is " + str1);
	            System.out.println("The string of the second line of data is " + str2);
	            br.close();
	        } catch (IOException e) {
	            System.out.println("Input/output error");
	        }
	    }
	}
