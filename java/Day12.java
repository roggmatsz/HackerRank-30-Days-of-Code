import java.util.*;
import java.io.*;

// Code given by challenge below
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
// ^^ Code given ends

class Student extends Person {
    int[] testScores;

    Student(String firstName, String lastName,
        int id, int scores[]) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    char calculate() {
        int average = 0;
        for(int i = 0; i < this.testScores.length; i++) {
            average += this.testScores[i];
        }
        average /= this.testScores.length;

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
        return 'x';
    }
 }

//Code given by challenge below
 public class Day12 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String firstName = scanner.next();
         String lastName = scanner.next();
         int id = scanner.nextInt();
         int numScores = scanner.nextInt();
         int[] testScores = new int[numScores];
         for(int i = 0; i < numScores; i++) {
             testScores[i] = scanner.nextInt();
         }
         scanner.close();

         Student s = new Student(firstName, lastName,
            id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
     }
 }