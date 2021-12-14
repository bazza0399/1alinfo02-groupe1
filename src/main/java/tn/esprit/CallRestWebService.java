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

public class CallRestWebService {

	
	public static void main(String[] args) {
		Marwen service = new Marwen();
		System.out.println(Marwen.getNba());
		
	}
}

