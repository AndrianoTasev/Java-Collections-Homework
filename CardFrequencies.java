import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Created by Andriano on 12.9.2015 ã..
 * We are given a sequence of N playing cards from a standard deck.
 * The input consists of several cards (face + suit), separated by a space.
 * Write a program to calculate and print at the console
 * the frequency of each card face in format "card_face -> frequency".
 * The frequency is calculated by the formula appearances / N and is expressed in percentages
 * with exactly 2 digits after the decimal point.
 * The card faces with their frequency should be printed
 * in the order of the card face's first appearance in the input.
 * The same card can appear multiple times in the input,
 * but it's face should be listed only once in the output.
 */
public class CardFrequencies {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> cardsByCount = new LinkedHashMap<>();
        for (String word : input) {
            String card = word.substring(0, word.length() - 1);
            Integer count = cardsByCount.get(card);
            if (count == null) {
                count = 0;
            }
            cardsByCount.put(card, count + 1);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : cardsByCount.entrySet()) {
            double frequency = ((double)stringIntegerEntry.getValue()*100)/input.length;
            System.out.printf("%s -> %.2f%%", stringIntegerEntry.getKey(), frequency);
            System.out.println();
        }
    }
}
