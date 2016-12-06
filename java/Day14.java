import java.io.*;
import java.util.*;
import java.math.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] numbers) {
        this.elements = numbers;
    }

    public void computeDifference() {
        int maxDifference = 0;
        for(int i = 0; i < this.elements.length; i++) {
            for(int j = i + 1; j < this.elements.length; j++ ) {
                if(Math.abs(elements[i] - elements[j]) > maxDifference) {
                    maxDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
        this.maximumDifference = maxDifference;
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        Difference difference = new Difference(a);
        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }
}