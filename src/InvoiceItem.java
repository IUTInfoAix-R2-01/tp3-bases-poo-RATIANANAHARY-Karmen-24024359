//Article de facture
public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem (String id, String desc,int qty, double unitPrice){
		this.id = id;
		this.desc = desc;
		this.qty  = qty;
		this.unitPrice = unitPrice;	
	}
	
	//Getters
	public String getId() {
		return id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public double unitPrice() {
		return unitPrice;
	}
	
	//Setters
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;	
	}
	
	public double getTotal() {
		return unitPrice*qty;
	}
	
	public String toString() {
		return "InvoiceItem[id=" + id + ",description=" + desc + ", quantity=" + qty + ", price_unity=" + unitPrice + "]";
	}
}