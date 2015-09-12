import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Write a program that reads two lists of letters l1 and l2 and combines them:
 * appends all letters c from l2 to the end of l1, but only when c does not appear in l1.
 * Print the obtained combined list.
 * All lists are given as sequence of letters separated by a single space,
 * each at a separate line. Use ArrayList<Character> of chars to keep the input and output lists.
 */
public class CombineListsOfLetters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] firstArray = scanner.nextLine().replaceAll(" ", " ").toCharArray();
        char[] secondArray = scanner.nextLine().replaceAll(" ", " ").toCharArray();

        List<Character> uniqueCharacters = new ArrayList<>();
        List<Character> tempCharacters = new ArrayList<>();

        for (char firstArr : firstArray) {
            uniqueCharacters.add(firstArr);
            tempCharacters.add(firstArr);
        }

        for (char secondArr : secondArray) {
            if (!tempCharacters.contains(secondArr)){
                uniqueCharacters.add(secondArr);
            }
        }

        for (Character uniqueCharacter : uniqueCharacters) {
            System.out.print(uniqueCharacter + " ");
        }

    }
}
