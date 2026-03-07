package org.campus02.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(4, "max", 2_000, "Sales"),
                new Employee(2, "susi", 4_000, "Development"),
                new Employee(1, "john", 3_000, "Sales"),
                new Employee(3, "max", 2_500, "Marketing"),
                new Employee(3, "jim", 2_000, "Development")
        };

        System.out.println("Sortierung nach natürlicher Reihenfolge:");
        System.out.println(Arrays.toString(employees));
        // nach natürlicher Reihenfolge sortieren
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
        System.out.println("---------------------------");

        System.out.println();
        System.out.println("### Übungsblatt ###");

        Arrays.sort(employees, new NameAscComparator());
        System.out.println("NameAscComparator:");
        System.out.println(Arrays.toString(employees));
        System.out.println();

        Arrays.sort(employees, new SalaryDescComparator());
        System.out.println("SalaryDescComparator:");
        System.out.println(Arrays.toString(employees));
        System.out.println();

        Arrays.sort(employees, new DepartmentAscNameDescComparator());
        System.out.println("DepartmentAscNameDescComparator:");
        System.out.println(Arrays.toString(employees));
        System.out.println();

        Arrays.sort(employees, new SalaryAscNameAscComparator());
        System.out.println("SalaryAscNameAscComparator:");
        System.out.println(Arrays.toString(employees));
    }
}
