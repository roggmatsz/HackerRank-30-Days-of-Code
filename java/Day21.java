import java.lang.reflect.Method;

class Day20 {

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