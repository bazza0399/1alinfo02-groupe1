package tn.esprit;

/**
 * @author Ahmed-Bazza
 * 
 * URL utiles :
 * http://theoryapp.com/parse-json-in-java/
 * https://jsonformatter.curiousconcept.com/
 * 
 *
 */

public class Ahmed {
	
	public static void main(String[] args) {
		String url1 = "https://jsonplaceholder.typicode.com/posts";
		System.out.println(ApiCall.get(url1));
		String url2 = "https://jsonplaceholder.typicode.com/posts/1/comments";
		System.out.println(ApiCall.get(url2));
	}

}
