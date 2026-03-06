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

        String[] strings = {"hallo", "wir", "sind", "fleißig", "am", "Ueben"};
        System.out.println(Arrays.toString(strings));
        // sortieren
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Student student1 = new Student(1, "Max", "Mustermann"); // STRG + D
        Student student2 = new Student(2, "Susi", "Sorglos"); // STRG + D
        Student student3 = new Student(3, "John", "Doe"); // STRG + D

        Student[] students = {student1, student2, student3};
        System.out.println(Arrays.toString(students));
        // sortieren
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
