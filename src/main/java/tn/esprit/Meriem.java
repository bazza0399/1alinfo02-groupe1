package tn.esprit;

public class Meriem {
	public static void main(String[] args) {
		String url = "https://jsonplaceholder.typicode.com/posts/1/comments";
		System.out.println(ApiCall.get(url));
	}


}
