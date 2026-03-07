package org.campus02.cart;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare(avgAmountPerArticle(o2), avgAmountPerArticle(o1));
    }

    private double avgAmountPerArticle(Cart cart) {
        return cart.getTotalAmount() / cart.getNumArticles();
    }
}