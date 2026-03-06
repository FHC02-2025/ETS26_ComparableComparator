package org.campus02.employee;

public class Employee implements Comparable<Employee> {

    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // aufsteigend nach emplNumber
        // default Sortierung
//        if (this.empNumber < o.empNumber)
//            return -1;
//        if (this.empNumber > o.empNumber)
//            return 1;
//        return 0;

        // spiegelt 1 zu 1 die obere implementierung wieder
        return Integer.compare(this.empNumber, o.empNumber);
    }
}

