import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");
            i++;
        }

        //printWordsStartingWith("Ø");
        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        printWordsWithDoubleConsonant();
        printLongestWord();
        printPartOfWord("Copenhagen", 1, 4);
        printPartOfWord("Java", 2, 10);
        printIfPalindrome("Racecar");
        printIfPalindrome("Copenhagen");
    }

    private static void printWordsOfLength(int l) {
        boolean wordIsValid = true;
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == l) {
                    if (s.contains(",") || s.contains(".")) {
                        wordIsValid = false;
                    }
                    if (wordIsValid) {
                        System.out.println(s);
                    }

                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.toLowerCase().startsWith(pattern.toLowerCase())) {
                    System.out.println(s);
                }
            }
        }
    }

    //skriv dine metoder herunder:
    private static void printWordsWithDoubleConsonant() {
        char[] nonConsonants = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ','};
        for (int i = 0; i < text.length; i++) { //array of lines
            for (int j = 0; j < text[i].length; j++) { //words
                for (int k = 1; k < text[i][j].length(); k++) { //letters
                        //Check if char is in array (https://stackoverflow.com/a/18581539)                           Check if char at k is equal to char at k-1
                    if (!(new String(nonConsonants).contains(String.valueOf(text[i][j].toLowerCase().charAt(k)))) && text[i][j].toLowerCase().charAt(k) == text[i][j].toLowerCase().charAt(k-1)) {
                        System.out.println(String.format("Word contains double consonant (%c): %s", text[i][j].charAt(k), text[i][j]));
                    }
                }
            }
        }
    }

    private static void printLongestWord() throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);
        int i = 0;
        String longestWord = "";
        while (scan.hasNextLine()) {
            scan.nextLine().split("\\. ");
            for (int j = 0; j < text[i].length; j++) { //words
                if (text[i][j].length() > longestWord.length()) {
                    longestWord = text[i][j];
                }
            }
            i++;
        }
        System.out.println(String.format("Longest word is %s (%d letters)", longestWord, longestWord.length()));
    }

    private static void printPartOfWord(String word, int indexStart, int substringLength) {
        try {
            System.out.println(word.substring(indexStart,indexStart+substringLength));
        } catch (StringIndexOutOfBoundsException e) {
            if (indexStart < word.length()) {
                System.out.println(word.substring(indexStart));
            } else {
                System.out.println(String.format("Error: Integer indexStart is greater than the provided word's length. [indexStart: %d | Word length: %d]\n" + e, indexStart, word.length()));
            }
        }
    }

    private static void printIfPalindrome(String word) {
        String reverse = "";
        for (int i=word.length()-1; i>-1; i--) {
            reverse += word.toLowerCase().charAt(i);
        }
        System.out.println(String.format("%s is " + (reverse.equals(word.toLowerCase()) ? "" : "NOT ") + "a palindrome (%s)", word.toLowerCase(), reverse));
    }
}
