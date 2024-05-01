import java.util.Scanner;
import java.util.Random;

public class TwoDArrayOperations {

    
     // Generates a 2D array of random integers with dimensions specified by the user.
    
    public static int[][] generateArray(int rows, int columns) {
        Random random = new Random();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10); // Generate random integers between 0 and 9
            }
        }
        return array;
    }

  
     //Displays the contents of a 2D array.
     
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }

    //Finds the sum of all elements in a 2D array.
     
    public static int findSum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }


     //Finds the maximum value in a 2D array.
     
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    
     //Finds the minimum value in a 2D array.
  
    public static int findMin(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

     //Transposes a 2D array (swap rows and columns).

    public static int[][] transposeArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] transposedArray = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        return transposedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array = generateArray(rows, columns);

        System.out.println("\nGenerated 2D Array:");
        displayArray(array);

        int sum = findSum(array);
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        System.out.println("\nTransposed 2D Array:");
        int[][] transposedArray = transposeArray(array);
        displayArray(transposedArray);
    }
}

