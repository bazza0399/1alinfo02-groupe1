package tn.esprit;

/**
 * @author abdelmoula-yassine
 * 
 * URL utiles :
 * http://theoryapp.com/parse-json-in-java/
 * https://jsonformatter.curiousconcept.com/
 * 
 *
 */

public class Article {

	private int id_article;

	private String nom_article;

	private String categorie;

	private int quantite;

	public Article(int id_article, String nom_article, String categorie, int quantite) {
		this.id_article = id_article;
		this.nom_article = nom_article;
		this.categorie = categorie;
		this.quantite = quantite;
	}
//Accesseurs

	public int getId_Article() {

		return this.id_article;

	}

	public String getNom_Article() {

		return this.nom_article;

	}

	public String getCategorie() {

		return this.categorie;

	}

	public int getQuantite() {

		return this.quantite;

	}

	//Modificateur

	public void setId_Article(int id_article) {



		this.id_article = id_article;

	}

	public void setNom_Aricle(String nom_article) {

		this.nom_article = nom_article;

	}

	public void setCategorie(String categorie) {

		this.categorie = categorie;

	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Article{" +
				"id_article=" + id_article +
				", nom_article='" + nom_article + '\'' +
				", categorie='" + categorie + '\'' +
				", quantite=" + quantite +
				'}';
	}

	public void setQuantite(int quantite) {

		this.quantite = quantite;

	}

}

	public static void main(String[] args) {
	Article a1=new Article(1,soupape,mecanique,39);
	System.out.println(a1);
	}

