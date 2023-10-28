
// Write a generic method to exchange the positions of two different elements in an array
import java.util.Arrays;

public class Exp3 {

    // Generic method to exchange elements in an array
    public static <T> void exchangeElements(T[] array, int index1, int index2) 
    {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) 
        {
            System.out.println("Invalid indices. Please provide valid indices within the array bounds.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Example usage with a single array
        String[] array = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Exchange elements at index 0 and index 4
        exchangeElements(array, 0, array.length-1);
        System.out.println("Array after exchanging elements: " + Arrays.toString(array));
        System.out.println();

        
        Integer[] array1 = {1,2,3,4,5,6};
        System.out.println("Original Array of type Int : " + Arrays.toString(array1));

        // Exchange elements at index 0 and index 4
        exchangeElements(array1, 0, array1.length-1);
        System.out.println("Array after exchanging elements of type Int : " + Arrays.toString(array1));
    }
}
