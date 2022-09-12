package modul_2.day_7.obiektowosc.zad_2;

import modul_1.day_5.ConsoleColors;

import java.util.Arrays;

public class ShoppingCart {
    public CartItem[] cartItems;

    public ShoppingCart() {
        cartItems = new CartItem[0];
    }

    public void addProduct(Product product, int quantity) {
        cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
        cartItems[cartItems.length - 1] = new CartItem(product, quantity);
    }

    public void removeProduct(Product product) {
        CartItem[] tmpCartItem = new CartItem[0];
        int idxTmp = 0;
        for (int i = 0; i < cartItems.length; i++) {
            if(!cartItems[i].getProduct().equals(product)) {
                tmpCartItem = Arrays.copyOf(tmpCartItem, tmpCartItem.length + 1);
                tmpCartItem[idxTmp] = cartItems[i];
                idxTmp++;
            }
        }
        cartItems = Arrays.copyOf(tmpCartItem, tmpCartItem.length);
    }

    public void updateProduct(Product product, int quantity) {
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getProduct().equals(product)) {
                cartItems[i].setQuantity(quantity);
            }
        }
    }

    public int getTotalQuantity() {
        int result = 0;
        for (int i = 0; i < cartItems.length; i++) {
            result += cartItems[i].getQuantity();
        }
        return result;
    }

    public double getTotalSum() {
        double result = 0;
        for (int i = 0; i < cartItems.length; i++) {
            result += cartItems[i].getProduct().getPrice() * cartItems[i].getQuantity();
        }
        return result;
    }

    public void printReceipt() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < cartItems.length; i++) {
            stringBuilder.append(ConsoleColors.WHITE + (i + 1)).append(ConsoleColors.GREEN + ": " + cartItems[i].getProduct().getName()).append(", ").
                    append(cartItems[i].getQuantity() + "x" + cartItems[i].getProduct().getPrice()).
                    append(" = ").append(ConsoleColors.RED + (cartItems[i].getQuantity() * cartItems[i].getProduct().getPrice())).append("\n");
        }
        stringBuilder.append(ConsoleColors.BLUE + "---");
        stringBuilder.append("\n").append(ConsoleColors.WHITE + "Razem: ").append(ConsoleColors.RED + getTotalSum());
        System.out.println(stringBuilder.toString());
    }
}
