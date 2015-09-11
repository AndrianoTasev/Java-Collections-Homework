import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andriano on 11.9.2015 ã..
 * Write a program to enter a number n and n integer numbers and sort and print them.
 * Keep the numbers in array of integers: int[].
 */
public class SortArrayOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(scanner.next());

        int[] arrayOfNumbers = new int[countOfNumbers];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(arrayOfNumbers);

        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + " ");
        }









    }
}
