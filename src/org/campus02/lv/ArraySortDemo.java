package org.campus02.lv;

import java.util.Arrays;

public class ArraySortDemo {

    // psvm
    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 9, 2};
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]); // wir erwarten uns: 4
        // Jetzt wird sortiert
        // nach der natürlich Ordnung
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]); // wir erwarten uns jetzt: 2

        char[] chars = {'c', 'a', 'B', 'A'};
        System.out.println(chars);
        // Sortieren
        Arrays.sort(chars);
        System.out.println(chars);



    }
}
