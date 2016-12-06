import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

public class Day19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        AdvancedArithmetic calculator = new Calculator();
        int sum = calculator.divisorSum(n);
        System.out.println("I implemented: " +
            calculator.getClass().getInterfaces()[0].getName());
    }
}