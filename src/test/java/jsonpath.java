import java.net.*;
import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class jsonpath {
	 public static void main(String[] args) throws Exception {
	        String responseString = new String();
	        responseString = "";
	        URL url = new URL("https://apiproxy.paytm.com/v2/movies/upcoming");
	        URLConnection yc = url.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                yc.getInputStream()));
	        String inputLine;

	        while ((inputLine = in.readLine()) != null) 
	            
	            responseString = responseString + inputLine ;
	        in.close();
	         
	         
	         


	JSONObject jsonObject =new JSONObject(responseString);
	JSONArray jsonArray = jsonObject.getJSONArray("upcomingMovieData");
	for(int i=0;i<jsonArray.length();i++){
	    JSONObject json = jsonArray.getJSONObject(i);
	    String moviePosterURL = json.getString("moviePosterUrl");
	    String fileFormat = "jpg";

	                    if (moviePosterURL.contains(".") && fileFormat.equalsIgnoreCase(moviePosterURL.substring(moviePosterURL.lastIndexOf(".") + 1))) {

	                        System.out.print(moviePosterURL);
	    System.out.print(" is in jpg format");
	    System.out.println();

	                    
	    
	    }
	}

	        
	    }
	}