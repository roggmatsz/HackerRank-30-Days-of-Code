import java.io.*;
import java.util.*;

class Solution {
    LinkedList stack;
    LinkedList queue;

    Solution() {
        this.stack = new LinkedList();
        this.queue = new LinkedList();
    }

    public void pushCharacter(char c) {
        stack.addFirst(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public void enqueueCharacter(char c) {
        queue.addLast();
    }

    public char dequeueCharacter() {
        return queue.pop();
    }
}

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