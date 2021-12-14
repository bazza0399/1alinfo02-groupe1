package tn.esprit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

/**
 * @author Ahmed-Bazza
 * 
 * URL utiles :
 * http://theoryapp.com/parse-json-in-java/
 * https://jsonformatter.curiousconcept.com/
 * 
 *
 */

public class ApiCall {
	private static HttpURLConnection connection;
	public static StringBuffer get(String apiUrl) {
		BufferedReader reader;
		StringBuffer responseContent  = new StringBuffer();
		String line;
		try {
			URL url = new URL(apiUrl);
			connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			int status = connection.getResponseCode();
			
			if(status>299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()) ); 
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
			} else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()) );
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseContent;
	}
}