package dao;

public class Produit {
	
	private int idProduit;
	private String nom;
	private float prix;
	
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int id) {
		this.idProduit = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Produit(int id, String nom, float prix) {
		super();
		this.idProduit = id;
		this.nom = nom;
		this.prix = prix;
	}
	public Produit() {
		super();
	}
	@Override
	public String toString() {
		return "Produit [id=" + idProduit + ", nom=" + nom + ", prix=" + prix + "]";
	}
	public Produit(String nom, float prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
	
	
}
