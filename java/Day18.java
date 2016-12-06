import java.io.*;
import java.util.*;

public class Day18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] s = input.toCharArray();

        Solution p = new Solution();

        for(char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for(int i = 0; i < s.length / 2; i++) {
            if(p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
    }
}