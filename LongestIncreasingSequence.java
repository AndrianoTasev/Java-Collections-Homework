import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Andriano on 11.9.2015 ã..
 * Write a program to find all increasing sequences inside an array of integers.
 * The integers are given in a single line, separated by a space.
 * Print the sequences in the order of their appearance in the input array,
 * each at a single line. Separate the sequence elements by a space.
 * Find also the longest increasing sequence and print it at the last line.
 * If several sequences have the same longest length, print the leftmost of them.
 */
public class LongestIncreasingSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }

        List<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(numbers[i]);
            while ((i < numbers.length - 1) && (numbers[i + 1] > numbers[i])){
                temp.add(numbers[i + 1]);
                i++;
            }

            System.out.print(temp);

            if (temp.size() > sequence.size()){
                sequence.clear();
                sequence.addAll(temp);
            }
        }

        System.out.println("Longest: " + sequence);
    }
}
