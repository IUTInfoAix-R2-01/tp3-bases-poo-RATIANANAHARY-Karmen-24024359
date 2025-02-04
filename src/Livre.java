public class Livre {
	private String nom;
	private double prix;
	private int quantite;
	
	public Livre (String nom, double prix, int quantite) {
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	//Getters
	public String getNom() {
		return nom;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public int  getQuantite() {
		return quantite;
	}
	
	 // Setters
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
	
	public String toString() {
        return "Livre[nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
    }
}