package n2;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    static String[][] players;
    static String[] cards = new String[48];
    static String[] rawCards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};

    public static void main(String[] args) {
        //form cards
        int c = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 12; j++) {
                cards[c] = rawCards[j] + "("+suits[i]+")";
                c++;
            }
        //get players count
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter players count: ");
        c = sc.nextInt();
        if (c>9)
            System.exit(-1);
        players = new String[c][];

        //form decks
        ArrayList<Integer> doneCards = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            //form hand
            String[] hand = new String[5];
            for (int j=0;j<5;j++) {
                int rand = (int) Math.floor(Math.random() * (47 + 1) + 0);
                while (doneCards.contains(rand)) {
                    rand = (int) Math.floor(Math.random() * (47 + 1) + 0);
                }
                hand[j] = cards[rand];
                doneCards.add(rand);
            }

            players[i] = hand;
        }

        //print out results
        for (int i = 0; i < c; i++) {
            //form hand
            System.out.printf("Player %d: \n%s, %s, %s, %s, %s\n\n",i+1,players[i][0],players[i][1],players[i][2],players[i][3],players[i][4]);
        }
    }
}
