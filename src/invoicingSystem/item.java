package invoicingSystem;

import java.io.Serializable;

public class item implements Serializable {
    private static final long serialVersionUID = 1L;
	private int itemID;
    private String itemName;
    private double unitPrice;
    private int quantity;
     private double totalPrice;
    private double qtyAmount;
    
    public  void setitemID(int itemId2) {
    	this.itemID= itemId2;
    }
    public int getItemID() {
        return itemID;
    }

    public void setItemName(String name) {
    	this.itemName= name;
    }
    public String getItemName() {
        return itemName;
    }
    public void setUnitPrice(double uprice) {
    	this.unitPrice= uprice;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setQuantity(int quan) {
    	this.quantity= quan;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQtyAmount(double qty) {
    	this.qtyAmount= qty;
    }
    public double getQtyAmount() {
        return qtyAmount;
    }
    public void setTotalPrice(double total) {
    	this.totalPrice= total;
    
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
