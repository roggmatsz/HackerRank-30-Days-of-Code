import java.util.*;
import java.io.*;

class Calculator {
    public int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow((double) n, (double) p);
    }
}

class Day17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator calc = new Calculator();
            try {
                int answer = calc.power(n, p);
                System.out.println(answer);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}