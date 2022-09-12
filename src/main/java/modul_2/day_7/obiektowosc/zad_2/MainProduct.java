package modul_2.day_7.obiektowosc.zad_2;

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("prod_1", 10);
        Product product2 = new Product("prod_2", 20);
        Product product3 = new Product("prod_3", 30);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1, 5);
        shoppingCart.addProduct(product3, 3);
        shoppingCart.addProduct(product3, 1);
        shoppingCart.addProduct(product2, 4);

        shoppingCart.printReceipt();

        shoppingCart.removeProduct(product3);
        shoppingCart.printReceipt();

        shoppingCart.updateProduct(product2, 2);
        shoppingCart.printReceipt();
    }
}
