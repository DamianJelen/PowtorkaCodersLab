package modul_2.day_7.obiektowosc.zad_2;

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("prod_1", 100);
        Product product2 = new Product("prod_2", 100);
        Product product3 = new Product("prod_3", 100);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
    }
}
