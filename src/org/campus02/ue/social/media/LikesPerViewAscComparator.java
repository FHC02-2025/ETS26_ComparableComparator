package org.campus02.ue.social.media;

import java.util.Comparator;

public class LikesPerViewAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        double likesPerViewO1 = o1.getLikes() / (o1.getViews() * 1.0);
        double likesPerViewO2 = o2.getLikes() / (o2.getViews() * 1.0);
        return Double.compare(likesPerViewO1, likesPerViewO2);
    }
}
