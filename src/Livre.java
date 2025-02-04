public class Livre {
	private String nom;
	private float prix;
	private int quantite;
	
	public Livre (String nom, float prix, int quantite) {
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public float getPrix() {
		return prix;
	}
	
	public int  getQuantite() {
		return quantite;
	}
	
	public String toString() {
        return "Livre[nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
    }
}