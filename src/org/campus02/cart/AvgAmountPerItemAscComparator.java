package org.campus02.cart;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare(avgAmountPerItem(o1), avgAmountPerItem(o2));
    }

    private double avgAmountPerItem(Cart cart) {
        return cart.getTotalAmount() / cart.getTotalItems();
    }
}