import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Write a program to find how many times a word appears in given text.
 * The text is given at the first input line.
 * The target word is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 * Consider that any non-letter character is a word separator.
 */
public class CountSpecifiedWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        String targetWord = scanner.nextLine();

        int count = 0;

        Pattern pattern = Pattern.compile(targetWord);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            count++;
        }

        System.out.print(count);
    }
}
