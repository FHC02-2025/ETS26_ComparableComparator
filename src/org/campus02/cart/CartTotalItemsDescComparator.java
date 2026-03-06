package org.campus02.cart;

import java.util.Comparator;

public class CartTotalItemsDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        int result = Integer.compare(o2.getTotalItems(), o1.getTotalItems());
        return result;
    }
}
