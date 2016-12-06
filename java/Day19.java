import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        List<Integer> divisors = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                divisors.add(i);
            }
        }
        int total = 0;
        for(int number : divisors) {
            total += number;
        }
        return total;
    }
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