package invoicingSystem;

public class Main {
    public static void main(String[] args) {
        shop myShop = new shop();
        menu myMenu = new menu(myShop);
        myMenu.showMainMenu();
    }
}

