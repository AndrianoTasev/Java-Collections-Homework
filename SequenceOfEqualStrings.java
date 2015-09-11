import java.util.Scanner;

/**
 * Created by Andriano on 11.9.2015 ã..
 * Write a program that enters an array of strings and finds in it all sequences
 * of equal elements. The input strings are given as a single line, separated by a space.
 */
public class SequenceOfEqualStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");

        if (inputLine.length == 1){
            System.out.print(inputLine[0]);
        }

        for (int i = 0; i < inputLine.length - 1; i++) {
            System.out.print(inputLine[i] + " ");
            while ((i < inputLine.length - 1) && (inputLine[i].equals(inputLine[i + 1]))){
                System.out.print(inputLine[i + 1]);
                i++;
            }
            System.out.println();
        }

        if ((inputLine.length > 1) && (!inputLine[inputLine.length - 1].equals(inputLine[inputLine.length - 2]))){
            System.out.println(inputLine[inputLine.length - 1]);
        }

    }
}
