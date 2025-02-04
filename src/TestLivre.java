public class TestLivre {
    public static void main(String[] args) {
        Livre p1 = new Livre("La Belle et la Bête", 12, 7);

        //modification quantité avec setters
        p1.setQuantite(15);
        
        System.out.println(p1);

        System.out.println("nom : " + p1.getNom());
        System.out.println("prix : " + p1.getPrix());
        System.out.println("quantite : " + p1.getQuantite());
    }
}
