package org.campus02.lv;

public class Student {
    private int matrNr;
    private String firstName;
    private String lastName;

    // ALT + EINFG
    public Student(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
