package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class S9 {
	    public static void main(String[] args) {
	        if (args.length != 1) {
	            System.out.println("Please specify the correct file name");
	            System.exit(1);
	        }
	        System.out.println("Reading file: " + args[0]);
	        
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(args[0]));
	            String str;
	            while ((str = br.readLine()) != null) {
	                System.out.println(str);
	            }
	            br.close();
	        } catch (IOException e) {
	            System.out.println("File read error");
	        }
	    }
}

