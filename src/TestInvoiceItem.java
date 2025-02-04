//Test Article de facture 

public class TestInvoiceItem {
	public static void main(String[] args) {
		InvoiceItem p1 = new InvoiceItem("Chaise de bureau", "Pliable, avec des roulettes et confortable pour travailler dans de bonnes conditions", 4, 79.99);

        //modification quantité avec setters
        p1.setUnitPrice(5);
        
        System.out.println(p1);

        System.out.println("id : " + p1.getId());
        System.out.println("desc : " + p1.getDesc());
        System.out.println("qty : " + p1.getQty());
        System.out.println("unitPrice : " + p1.getQty());
        
        System.out.println("The total is: " + p1.getTotal());
    }
}