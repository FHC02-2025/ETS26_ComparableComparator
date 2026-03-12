package org.campus02.ue.social.media;

import java.util.Comparator;

public class DateTimeDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return o2.getDateTime().compareTo(o1.getDateTime());
    }
}