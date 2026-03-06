package org.campus02.lv;

public class Highscore implements Comparable<Highscore> {

    private double score;
    private String name;

    public Highscore(double score, String name) {
        this.score = score;
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Highscore{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Highscore other) {
        // aufsteigend nach score sortieren
//        if (this.score < other.score)
//            return -1;
//        if (this.score > other.score)
//            return 1;
//        else
//            return 0;

        // default Sortierung absteigend nach score
        if (this.score < other.score)
            return 1;
        if (this.score > other.score)
            return -1;
        else
            return 0;
    }
}
