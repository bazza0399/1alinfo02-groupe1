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
		String url = "https://jsonplaceholder.typicode.com/posts";
		System.out.println(ApiCall.get(url));
	}

}
