package org.campus02.ue.social.media;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class PostingDemo {

    public static void main(String[] args) {
        Posting posting1 = new Posting(3, "max mustermann", "maxi90", LocalDateTime.now(), 23, 233, 53);
        Posting posting2 = new Posting(2, "susi sorglos", "su_si", LocalDateTime.now().plusDays(1), 23, 234, 53);
        Posting posting3 = new Posting(32, "john doe", "jd", LocalDateTime.now().minusDays(2), 233, 633, 53);
        Posting posting4 = new Posting(1, "donuld duck", "d_duck", LocalDateTime.now(), 123, 23, 253);
        Posting posting5 = new Posting(5, "susi sorglos", "su_si", LocalDateTime.now().plusDays(5), 5, 555, 53);

        ArrayList<Posting> postings = new ArrayList<>();
        postings.add(posting1);
        postings.add(posting2);
        postings.add(posting3);
        postings.add(posting4);
        postings.add(posting5);

        System.out.println(postings);
        Collections.sort(postings);
        System.out.println(postings);
        postings.sort(new RealnameAscComparator());
        System.out.println(postings);
        postings.sort(new DateTimeDescComparator());
        System.out.println(postings);
        postings.sort(new LikesDescSharesDescComparator());
        System.out.println(postings);
        postings.sort(new ViewsDescSharesAscComparator());
        System.out.println(postings);
        postings.sort(new LikesPerViewAscComparator());
        System.out.println(postings);
        postings.sort(new ShareLikeRatioDescComparator());
        System.out.println(postings);
    }
}