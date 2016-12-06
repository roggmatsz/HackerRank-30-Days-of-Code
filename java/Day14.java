import java.io.*;
import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;
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