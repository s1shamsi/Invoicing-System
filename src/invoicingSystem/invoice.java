package invoicingSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    private int numberOfItems;
    private int invoiceNo = 0;
    private String customerFullName;
    private String customerPhone;
    private double totalAmount =0;
    private double paidAmount =0;
    private double balance =0;
    private Date invoiceDate;
     ArrayList<item> items = new ArrayList<item>();
    
    public void setCustomerFullName(String name) {
    	this.customerFullName= name;
    }
    public String getCustomerFullName() {
        return customerFullName;
    }
    public void setCustomerPhone(String Pnumber) {
    	this.customerPhone= Pnumber;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setInvoiceDate(Date date) {
    	this.invoiceDate= date;
    }
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setTotalAmount(double tprice) {
    	this.totalAmount= tprice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public void setPaidAmount1(double paid) {
    	this.paidAmount= paid;
        
        
    }
    public double getPaidAmount() {
        return paidAmount;
    }
    public void setBalance(double blnc) {
    	this.balance= blnc;
    	
        
    }
    public double getBalance() {
        return balance;
    }

	public void setInvoiceNo(int no) {
		
	this.invoiceNo = no;

	
	}
	 public int getInvoiceNo() {
	        return invoiceNo;
	    }
	 
	public void setNumberOfItems(int no2) {
		
		this.numberOfItems = no2;

		
		}
		public int getNumberOfItems() {
			
			return numberOfItems;
		}
    public ArrayList<item> getItems() {
        return items;
    }
    public void addItem(item item) {
        items.add(item);
        numberOfItems++;
        totalAmount += item.getTotalPrice();
    }

    }