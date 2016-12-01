import java.util.*;
import java.io.*;

class Day8 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> addressBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            addressBook.put(name, phone);
        }
        while(in.hasNext()) {
            String s = in.next();
            if(addressBook.containsKey(s)) {
                System.out.println(s + "=" + addressBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}