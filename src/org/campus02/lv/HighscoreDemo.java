package org.campus02.lv;

import java.util.Arrays;

public class HighscoreDemo {

    public static void main(String[] args) {

        Highscore[] highscores = {
                new Highscore(55.30, "max"),
                new Highscore(22.80, "susi"),
                new Highscore(99.99, "john")
        };

        System.out.println(Arrays.toString(highscores));
        Arrays.sort(highscores);
        System.out.println(Arrays.toString(highscores));
    }
}
