import java.util.Scanner;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Write a program to count the number of words in given sentence.
 * Use any non-letter character as word separator.
 */
public class CountAllWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        
        System.out.print(input.length);
    }
}
