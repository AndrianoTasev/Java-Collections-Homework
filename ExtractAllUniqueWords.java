import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.*;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Write a program to find the most frequent word in a text and print it,
 * as well as how many times it appears in format "word -> count".
 * Consider any non-letter character as a word separator. Ignore the character casing.
 * If several words have the same maximal frequency, print all of them in alphabetical order.
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split("[\\W]+");

        Map<String, Integer> wordsByCount = new TreeMap<>();

        for (String word : input) {
            Integer count = wordsByCount.get(word);
            if (count == null){
                count = 0;
            }
            wordsByCount.put(word.toLowerCase(), count + 1);
        }
        int maxValue = 0;
        for (Integer integer : wordsByCount.values()) {
            if (integer > maxValue){
                maxValue = integer;
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : wordsByCount.entrySet()) {
            if (stringIntegerEntry.getValue() == maxValue){
                System.out.println(stringIntegerEntry.getKey() + " -> " + maxValue + " times");
            }
        }
    }
}
