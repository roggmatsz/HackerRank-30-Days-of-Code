import java.io.*;
import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binary = Integer.toBinaryString(n);
        int consecutiveCounter = 0;
        int maxConsecutive = 0;
        for(int i = 0; i < binary.length(); i++) {
            switch(binary.charAt(i)) {
                case '1':
                    consecutiveCounter++;
                    break;
                case '0':
                    if(maxConsecutive < consecutiveCounter) {
                        maxConsecutive = consecutiveCounter;
                    }
                    consecutiveCounter = 0;
                    break;
                default:
                    break;
            }
        }
        if(maxConsecutive < consecutiveCounter) {
            maxConsecutive = consecutiveCounter;
        }
        System.out.println(binary);
        System.out.println(maxConsecutive);
    }
}