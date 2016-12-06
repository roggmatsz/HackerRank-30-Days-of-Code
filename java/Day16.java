import java.io.*;
import java.util.*;

public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int parsedInt;
        try {
            parsedInt = Integer.parseInt(S);
            System.out.println(parsedInt);
        } catch(Exception e) {
            System.out.println("Bad String.");
        }
    }
}