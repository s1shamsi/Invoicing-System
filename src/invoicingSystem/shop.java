package invoicingSystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class shop {
	  private String shopName;
      private String tel;
      private String fax;
      private String email;
      private String website;
       ArrayList<item> items= new ArrayList<item>();
       ArrayList<invoice> invoices = new ArrayList<invoice>();


      public void setShopName(String shopName) {
          this.shopName = shopName;
      }

      public String getShopName() {
          return shopName;
      }

      public void setTel(String tel) {
          this.tel = tel;
      }

      public String getTel() {
          return tel;
      }

      public void setFax(String fax) {
          this.fax = fax;
      }

      public String getFax() {
          return fax;
      }

      public void setEmail(String email) {
          this.email = email;
      }

      public String getEmail() {
          return email;
      }

      public void setWebsite(String website) {
          this.website = website;
      }

      public String getWebsite() {
          return website;
      }

      public void addItem(item item) {
          items.add(item);
      }

      public void deleteItem(int itemId) {
    	    for (int i = 0; i < this.items.size(); i++) {
    	        if (items.get(i).getItemID() == itemId) {
    	            this.items.remove(i);
    	            break;
    	        }
    	    }
    	}



      public void changeItemPrice(int itemId, double newPrice) {
    	    for (int i = 0; i < this.items.size(); i++) {
    	        if (this.items.get(i).getItemID() == itemId) {
    	            this.items.get(i).setUnitPrice(newPrice);
    	            break;
    	        }
    	    }
    	}



    

      public ArrayList<item> getAllItems() {
          return items;
      }

      public void createNewInvoice(invoice invoice) {
          invoices.add(invoice);
      }

      public ArrayList<invoice> getAllInvoices() {
          return invoices;
      }

      public invoice getInvoice(int invoiceNo) {
          for (int i = 0; i < this.invoices.size(); i++) {
              if (this.invoices.get(i).getInvoiceNo() == invoiceNo) {
                  return invoices.get(i);
              }
          }
          return null;
      }

      public int getNumberOfItems() {
          return items.size();
      }

      public int getNumberOfInvoices() {
          return invoices.size();
      }

      public double getTotalSales() {
          double totalSales = 0;
          for (int i = 0; i < invoices.size(); i++) {
              totalSales += invoices.get(i).getTotalAmount();
          }
          return totalSales;
      }

      public boolean loadData() {

    	    try {
    	        // Loading items
    	        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\items.txt");
    	        ObjectInputStream ois = new ObjectInputStream(fis);
    	        this.items = (ArrayList<item>) ois.readObject();
    	        ois.close();
    	        fis.close();

    	        // Loading invoices
    	        FileInputStream fis1 = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\invoices.txt");
    	        ObjectInputStream ois1 = new ObjectInputStream(fis1);
    	        this.invoices = (ArrayList<invoice>) ois1.readObject();
    	        ois1.close();
    	        fis1.close();

    	        // Loading shop details
    	        FileInputStream fis2 = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\shopDetails.txt");
    	        ObjectInputStream ois2 = new ObjectInputStream(fis2);
    	        this.shopName = ois2.readUTF();
    	        this.tel = ois2.readUTF();
    	        this.fax = ois2.readUTF();
    	        this.email = ois2.readUTF();
    	        this.website = ois2.readUTF();
    	        ois2.close();
    	        fis2.close();
    	 
    	}
    	        		catch (FileNotFoundException e) {
    	        System.out.println("Error loading data: File not found.");
    	        return false;
    	    } catch (IOException e) {
    	        System.out.println("Error loading data: IOException.");
    	        return false;
    	    } catch (ClassNotFoundException e) {
    	        System.out.println("Error loading data: Class not found.");
    	        return false;
    	    } catch (Exception e) {
    	        System.out.println("Error loading data: " + e.getMessage());
    	        return false;
    	    }
    	    System.out.println("Data loaded successfully.");
    	    return true;
    	}



      public void saveData() {
    	    try {
    	        // Saving items
    	        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\items.txt");
    	        ObjectOutputStream oos = new ObjectOutputStream(fos);
    	        oos.writeObject(items);
    	        oos.close();
    	        fos.close();

    	        // Saving invoices
    	        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\invoices.txt");
    	        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
    	        oos1.writeObject(invoices);
    	        oos1.close();
    	        fos1.close();

    	        // Saving shop details
    	        FileOutputStream fos2 = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\invoicingSystem\\shopDetails.txt");
    	        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
    	        oos2.writeUTF(shopName);
    	        oos2.writeUTF(tel);
    	        oos2.writeUTF(fax);
    	        oos2.writeUTF(email);
    	        oos2.writeUTF(website);
    	        oos2.close();
    	        fos2.close();
    	        } catch (Exception e) {
    	        System.out.println("Error saving data: " + e.getMessage());
    	        }
    	        }





}
