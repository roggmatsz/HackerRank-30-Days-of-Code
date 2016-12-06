import java.io.*;
import java.util.*;

public class Day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++) {
            a[a_i] = scanner.nextInt();
        }

        int swaps = bubbleSort(a);
        System.out.println("Array is sorted in " + 
            swaps +
            "\nFirst Element: " + a[0] + 
            "\nLast Element: " + a[n - 1]
        );
    }

    static int bubbleSort(int[] numberList) {
        for(int i = 0; i < n; i++) {
            int swaps = 0;

            for(int j = 0; j < n - 1; j++) {
                if(a[j] > a[j + 1]) {
                    swap(numberList, j, j + 1);
                    swaps++;
                }
            }
            if(swaps == 0) {
                break;
            }
        }
        return swaps;
    }

    static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}