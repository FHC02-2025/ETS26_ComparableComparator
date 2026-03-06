package org.campus02.lv;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(1);
        ints.add(3);

        System.out.println(ints);
        // Sortierung
        // Achtung !!! Arrays.sort nicht möglich
        Collections.sort(ints);
        System.out.println(ints);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("ollaH");

        Collections.sort(strings);
        System.out.println(strings);

        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Max", "Mustermann"); // STRG + D
        Student student2 = new Student(Integer.MIN_VALUE, "Susi", "Sorglos"); // STRG + D
        Student student3 = new Student(3, "John", "Doe"); // STRG + D

        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }
}
