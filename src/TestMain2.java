//Test Article de facture 

public class TestMain2 {
	public static void main(String[] args) {
		//InvoiceItem
		InvoiceItem p1 = new InvoiceItem("Chaise de bureau", "Pliable, avec des roulettes et confortable pour travailler dans de bonnes conditions", 4, 79.99);

        //modification quantité avec setters
        p1.setUnitPrice(5);
        
        System.out.println(p1);

        //Test getters
        System.out.println("id : " + p1.getId());
        System.out.println("desc : " + p1.getDesc());
        System.out.println("qty : " + p1.getQty());
        System.out.println("unitPrice : " + p1.getQty());
        
        System.out.println("The total is: " + p1.getTotal());
        
        //Account
        Account a1 = new Account("7FG5R","Chevre", 172);
        System.out.println(a1);
        Account a2 = new Account("CSG4E1", "Toro", 544); 
        System.out.println(a2);
        
        
        //Test getters
        System.out.println("Id: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());
        
        //Crédit et débit
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  
        System.out.println(a1);
        
        //Transfert
        a1.transferTo(a2, 100); 
        System.out.println(a1);
        System.out.println(a2);
    }
	
}