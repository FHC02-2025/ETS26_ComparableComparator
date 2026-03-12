package org.campus02.ue.social.media;

import java.util.Comparator;

public class LikesDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        int res = Integer.compare(o2.getLikes(), o1.getLikes());
        if (res == 0) {
            res = Integer.compare(o2.getShares(), o1.getShares());
        }
        return res;
    }
}