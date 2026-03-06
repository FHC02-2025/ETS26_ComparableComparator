package org.campus02.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(4, "max", 2_000, "Sales"),
                new Employee(2, "susi", 4_000, "Development"),
                new Employee(1, "john", 3_000, "Sales"),
                new Employee(3, "max", 2_500, "Marketing")
        };

        System.out.println("Sortierung nach natürlicher Reihenfolge:");
        System.out.println(Arrays.toString(employees));
        // nach natürlicher Reihenfolge sortieren
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
        System.out.println("---------------------------");
    }
}
