package tn.esprit;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public  class Marwen {
	public static  String endpoint = "https://api-nba-v1.p.rapidapi.com/seasons/";
	public void getNba() {
		try {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://api-nba-v1.p.rapidapi.com/seasons/"))
				.header("x-rapidapi-host", "api-nba-v1.p.rapidapi.com")
				.header("x-rapidapi-key", "e6fb6bbfcdmshb3bec53c6bb160dp16d40bjsne382e58f08ad")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		        System.out.println(response.body());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
