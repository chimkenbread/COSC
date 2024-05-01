import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFilter {
   
    //Reads words from a text file and stores them in an array.
    public static String[] readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+"); // Split by whitespace
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
        }
        return words.toArray(new String[0]);
    }

    //Filters words based on their lengths.
    private static String[] filterWordsByLength(String[] words, int length) {
        List<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == length) {
                filteredWords.add(word);
            }
        }
        return filteredWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for word length
        System.out.print("Enter the desired length of words to filter: ");
        int length;
        try {
            length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        try {
            String fileName = "words_alpha.txt"; // Provide the correct file path

            // Read words from file
            String[] words = readWordsFromFile(fileName);

            // Filter words based on length
            String[] filteredWords = filterWordsByLength(words, length);

            // Display filtered words
            if (filteredWords.length > 0) {
                System.out.println("Words with length " + length + ":");
                for (String word : filteredWords) {
                    System.out.println(word);
                }
            } else {
                System.out.println("No words found with length " + length + ".");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
