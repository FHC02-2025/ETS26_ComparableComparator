package org.campus02.employee;

import java.util.Comparator;

public class SalaryAscNameAscComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = Double.compare(o1.getSalary(), o2.getSalary());
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}