import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {
    public static Node insert(Node head, int data) {

    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int n = scanner.nextInt();

        while(n-- > 0) {
            int el = scanner.nextInt();
            head = insert(head, el);
        }
        display(head);
        scanner.close();
    }
}