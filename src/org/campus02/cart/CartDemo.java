package org.campus02.cart;

import java.util.ArrayList;
import java.util.Collections;

public class CartDemo {

    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("max", 1, 5, 100.00));
        carts.add(new Cart("susi", 5, 6, 135.00));
        carts.add(new Cart("john", 15, 20, 525.50));


        System.out.println(carts);
        // sortieren
        Collections.sort(carts);
        System.out.println(carts);

        System.out.println();
        System.out.println("Sortiere nach TotalItems mittels Comparator");
        Collections.sort(carts, new CartTotalItemsDescComparator());
        System.out.println(carts);

        // zweite Möglichkeit den Comparator zu verwenden
        carts.sort(new CartTotalItemsDescComparator());
        System.out.println(carts);

    }


}
