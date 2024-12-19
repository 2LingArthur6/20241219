import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

public class URLReader {
    public static void main(String[] args) {
        String urlString = "http://example.com";
        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a URL connection
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            // Read the webpage content
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // Output each line directly
                System.out.println(inputLine);
            }

            // Close the input stream
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
