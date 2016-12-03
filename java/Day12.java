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

    char calculate() {
        int average = 0;
        for(int i = 0; i < this.testResults.length(); i++) {
            average += this.testResults[i];
        }
        average /= this.testResults.length();

        if(average >= 90 && average <= 100) {
            return 'O';
        } else if(average >= 80 && average < 90) {
            return 'E';
        } else if(average >= 70 && average < 80) {
            return 'A';
        } else if(average >= 55 && average < 70) {
            return 'P';
        } else if(average >= 40 && average < 55) {
            return 'D';
        } else if(average < 40) {
            return 'T';
        }
    }
 }