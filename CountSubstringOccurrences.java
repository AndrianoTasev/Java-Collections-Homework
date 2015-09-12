import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Write a program to find how many times given string appears in given text as substring.
 * The text is given at the first input line.
 * The search string is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 */
public class CountSubstringOccurrences {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        String searchString = scanner.next().toLowerCase();

        int count = 0;

        Pattern pattern = Pattern.compile(searchString);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            count++;
        }

        System.out.print(count);
    }
}
