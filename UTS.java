import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan teks: ");
            String text = scanner.nextLine();

            if (text == null || text.trim().isEmpty()) {
                System.out.println("Please enter a valid text.");
                return;
            }

            try {
                int wordCount = countWordsInText(text);
                int letterCount = countLettersInText(text);

                System.out.println("Jumlah kata: " + wordCount);
                System.out.println("Jumlah huruf: " + letterCount);
            } catch (NullPointerException e) {
                System.out.println("Error: Input text is null.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    /**
     * Returns the number of words in the given text.
     *
     * @param text the input text
     * @return the word count
     */
    public static int countWordsInText(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    /**
     * Returns the number of letters in the given text.
     *
     * @param text the input text
     * @return the letter count
     */
    public static int countLettersInText(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}