package tn.esprit;



public class Ahmed {
	

	public static void main(String[] args) {
		String url = "https://jsonplaceholder.typicode.com/posts";
		System.out.println(ApiCall.get(url));
	}

}
