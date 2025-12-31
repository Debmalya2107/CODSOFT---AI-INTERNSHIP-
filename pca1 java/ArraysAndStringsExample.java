import java.util.Arrays;

public class ArraysAndStringsExample {
    public static void main(String[] args) {
        // ----- Arrays Class -----
        int[] numbers = {40, 10, 30, 20, 50};

        // Printing array using Arrays.toString()
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sorting array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching (Binary Search) → works on sorted array
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Element 30 found at index: " + index);

        // ----- String Handling -----
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // concatenation
        System.out.println("\nString Concatenation: " + str3);
        System.out.println("Length of String: " + str3.length());
        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Substring(0,5): " + str3.substring(0, 5));
        System.out.println("Equals (Hello World): " + str3.equals("Hello World"));

        // ----- StringBuffer (Thread-Safe) -----
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println("\nStringBuffer after append: " + sb);
        sb.insert(5, "Language ");
        System.out.println("StringBuffer after insert: " + sb);
        sb.reverse();
        System.out.println("StringBuffer after reverse: " + sb);

        // ----- StringBuilder (Faster, Not Thread-Safe) -----
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println("\nStringBuilder after append: " + sb2);
        sb2.replace(0, 5, "Hi");
        System.out.println("StringBuilder after replace: " + sb2);
        sb2.delete(2, 5);
        System.out.println("StringBuilder after delete: " + sb2);
    }
}