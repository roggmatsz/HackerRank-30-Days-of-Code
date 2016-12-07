import java.lang.reflect.Method;

class Day20 {
    static <T> void printArray(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = { "Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if(Day20.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1" + 
            " method named printArray.");
        }
    }
}