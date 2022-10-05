package modul_4.day_14.sessions.zad_4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CartItem {
    private String name;
    private int quantity;
    private double price;

    protected static List<CartItem> resultCartItems(List<CartItem> items) {
        for (int i = 0; i < items.size(); i++) {
            for (int j = i + 1; j < items.size(); j++) {
                if(items.get(i).getName().equals(items.get(j).getName())) {
                    items.get(i).setQuantity(items.get(i).getQuantity() + items.get(j).getQuantity());
                    items.remove(j);
                    j = i + 1;
                }
            }
        }

        return items;
    }

    protected static double sumPriceItems(List<CartItem> items) {
        double result = 0;

        for (int i = 0; i < items.size(); i++) {
            result += items.get(i).getQuantity() * items.get(i).getPrice();
        }

        return result;
    }
}