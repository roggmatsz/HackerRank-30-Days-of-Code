import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, 
        int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;    
    }

    public void printPerson() {
        System.out.println(
            "Name: " + lastName + ", " + firstName
            + "\nID: " + idNumber);
    }
}

class Student extends Person {
    int[] testResults;

    Student(String firstName, String lastName,
        int id, int[] scores) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.idNumber = id;
        this.testResults = scores;
    }


}