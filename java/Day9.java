import java.io.*;
import java.util.*;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    private static int factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}