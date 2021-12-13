package tn.esprit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public  class Marwen {
	
	public static  String endpoint = "https://www.fishwatch.gov/api/species/red-snapper";
	private static HttpURLConnection connection;
	public static StringBuffer getNba() {
		BufferedReader reader;
		StringBuffer responseContent  = new StringBuffer();
		String line;
		try {
			URL url = new URL(endpoint);
			connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
						
			connection.setReadTimeout(36000);
			int status = connection.getResponseCode();
			System.out.println(status);
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
		System.out.println(responseContent);
		return responseContent;
	}
}
