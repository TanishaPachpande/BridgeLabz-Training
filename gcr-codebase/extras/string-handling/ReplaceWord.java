import java.util.Scanner;

public class ReplaceWord {
    
    // Function to replace old word with a new word
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.equals(oldWord)) {
                    result = result + newWord;
                } else {
                    result = result + word;
                }
                result = result + " ";
                word = "";
            }
        }

        // For last word
        if (word.equals(oldWord)) {
            result = result + newWord;
        } else {
            result = result + word;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Input a string
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

	// Input a word to replace
        System.out.print("Word to replace: ");
        String oldWord = sc.next();

	// Input a new word after replacing
        System.out.print("New word: ");
        String newWord = sc.next();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

	// Displaying result
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
