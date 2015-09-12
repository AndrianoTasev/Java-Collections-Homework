import java.util.Scanner;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Nakov is keen card player and he is now learning a new game.
 * The game uses a standard deck of 52 cards.
 * The card faces are: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A.
 * The cards suits are denoted by the letters S (spades), H (hearts), D (diamonds) and C (clubs).
 * The player is given a hand of cards and he needs to count their sum.
 * Card values are the following: 2 -> 2, 3 -> 3, 4 -> 4, 5 -> 5, 6 -> 6, 7 -> 7, 8 -> 8, 9 -> 9,
 * 10 -> 10, J -> 12, Q -> 13, K -> 14, A -> 15 (the card suits are ignored).
 * When two or more cards of the same face come sequentially, their values are counted twice.
 *For example, the hand "2C 2H 2D AS 10H 10C 2S KD" has value (2 + 2 + 2) * 2 + 15 + (10 + 10) * 2 + 2 + 14 = 83.
 *Write a program that takes a hand of cards and counts their sum.
 **/
public class SumCards {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] hand = scanner.nextLine().split(" ");

        int handValue = 0;

        for (int i = 0; i < hand.length ; i++) {
            String card = hand[i];

            String cardFace = card.substring(0, card.length() - 1);

            int cardValue = getCardValue(cardFace);
            handValue += cardValue;
        }

        int sequenceCounter = 1;

        for (int i = 0; i < hand.length - 1; i++) {
            String card = hand[i];

            String cardFace = card.substring(0, card.length() - 1);

            String nextCardFace = hand[i + 1].substring(0, hand[i + 1].length() - 1);

            int cardValue = getCardValue(cardFace);

            if (cardFace.equals(nextCardFace)){
                sequenceCounter++;
            }

            if (sequenceCounter > 1 && !cardFace.equals(nextCardFace)){
                handValue += cardValue* sequenceCounter;
                sequenceCounter = 1;
            }

            if (sequenceCounter > 1 && i == hand.length - 2){
                handValue += cardValue* sequenceCounter;
                sequenceCounter = 1;
            }
        }
        System.out.print(handValue);
    }
    private static  int getCardValue(String cardFace){
        int cardValue = 0;
        switch (cardFace){
            case "2":
                cardValue = 2;
                break;
            case "3":
                cardValue=3;
                break;
            case "4":
                cardValue = 4;
                break;
            case "5":
                cardValue = 5;
                break;
            case "6":
                cardValue = 6;
                break;
            case "7":
                cardValue = 7;
                break;
            case "8":
                cardValue = 8;
                break;
            case "9":
                cardValue = 9;
                break;
            case "10":
                cardValue = 10;
                break;
            case "J":
                cardValue =12;
                break;
            case "Q":
                cardValue = 13;
                break;
            case "K":
                cardValue = 14;
                break;
            case "A":
                cardValue = 15;
                break;
        }
        return cardValue;
    }
}
