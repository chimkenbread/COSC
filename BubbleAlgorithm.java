import java.util.Random;


public class BubbleAlgorithm {


    // Generates an array of random integers of a specified size.
     
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generate random integers between 0 and 99
        }
        return array;
    }

    
     //Sorts the given array using the bubble sort algorithm.
    
    private static int BubbleAlgorithm(int[] array) {
        int n = array.length;
        int comparisons = 0;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }
            // Display array after each pass
            System.out.print("Pass " + (i + 1) + ": ");
            displayArray(array);
            System.out.println(" (Comparisons: " + comparisons + ", Swaps: " + swaps + ")");
        }
        return comparisons;
    }

    
     //Displays the elements of the array.
   
    private static void displayArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray(5); // Generate array of size 5
        System.out.print("Original Array: ");
        displayArray(array);

        int comparisons = BubbleAlgorithm(array);
        System.out.println("Sorted Array: ");
        displayArray(array);
        System.out.println("Total Comparisons: " + comparisons + " Total Swaps: " + (array.length - 1));
    }
}
