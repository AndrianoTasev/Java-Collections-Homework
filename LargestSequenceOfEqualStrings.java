import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Andriano on 11.9.2015 ã..
 * Write a program that enters an array of strings and finds in it the largest sequence
 * of equal elements. If several sequences have the same longest length,
 * print the leftmost of them. The input strings are given as a single line,
 * separated by a space.
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");

        List<String> sequence = new ArrayList<>();

        for (int i = 0; i < inputLine.length - 1; i++) {
            List<String> temp = new ArrayList<>();

            temp.add(inputLine[i]);

            while ((i  < inputLine.length - 1) &&(inputLine[i + 1].equals(inputLine[i]))){
                temp.add(inputLine[i + 1]);
                i++;
            }

            if (temp.size() > sequence.size()){
                sequence.clear();
                sequence.addAll(temp);
            }
        }

        if (inputLine.length == 1){
            sequence.add(inputLine[0]);
        }
        
        System.out.println(sequence);
    }
}
