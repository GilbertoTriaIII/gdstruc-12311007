import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeckStack deckStack = new DeckStack();
        PlayerStack playerStack = new PlayerStack();
        DiscardStack discardStack = new DiscardStack();

        deckStack.push(new Card(1, "The Sorceress"));
        deckStack.push(new Card(2, "The Huntress"));
        deckStack.push(new Card(3, "The Centaur"));
        deckStack.push(new Card(4, "The Captain"));
        deckStack.push(new Card(5, "The King of Argos"));
        deckStack.push(new Card(6, "The Minotaur"));
        deckStack.push(new Card(7, "The Champion"));
        deckStack.push(new Card(8, "The Enchantress"));
        deckStack.push(new Card(9, "The Swift Runner"));
        deckStack.push(new Card(10, "The Sea Beast"));
        deckStack.push(new Card(11, "The Artificer"));
        deckStack.push(new Card(12, "The Wayward Son"));
        deckStack.push(new Card(13, "The Moon"));
        deckStack.push(new Card(14, "The Furies"));
        deckStack.push(new Card(15, "The Titan Thief"));
        deckStack.push(new Card(16, "The Messenger"));
        deckStack.push(new Card(17, "The Fates"));
        deckStack.push(new Card(18, "The Unseen"));
        deckStack.push(new Card(19, "The Boatman"));
        deckStack.push(new Card(20, "The Queen"));
        deckStack.push(new Card(21, "The Lovers"));
        deckStack.push(new Card(22, "The Vengeful Mother"));
        deckStack.push(new Card(23, "The Mycenaean King"));
        deckStack.push(new Card(24, "The Cupid"));
        deckStack.push(new Card(25, "The Forge"));
        deckStack.push(new Card(26, "The Grey-Eyed"));
        deckStack.push(new Card(27, "The Hearth"));
        deckStack.push(new Card(28, "The Amazons"));
        deckStack.push(new Card(29, "The Gorgon"));
        deckStack.push(new Card(30, "The Cyclops"));

        // for printing
        System.out.println("\n =================================== \n Initial Stack: \n ===================================");
        deckStack.printStack();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (!deckStack.isEmpty()) {
            int turn = 0;
            turn++;
            System.out.println("\n ===== TURN " + turn + "=====");
            System.out.println("\n ACTIONS:");

            // DRAWING (deckStack to playerStack)
            int x = random.nextInt(6) + 1;
            System.out.println("\n Cards displaced: " + x);

            for (int i = 0; i < x; i++) {
                if (deckStack.isEmpty()) {
                    break;
                }

                System.out.println("\n DRAWN FROM DECK: ");
                Card placeholder;
                placeholder = deckStack.pop();
                System.out.println(placeholder);
                playerStack.push(placeholder);
            }

            // DISCARDING (playerStack to discardSTack)
            x = random.nextInt(6) + 1;
            System.out.println("\n Cards displaced: " + x);

            for (int i = 0; i < x; i++) {
                if (playerStack.isEmpty()) {
                    break;
                }
                System.out.println("\n DISCARDED");
                Card placeholder;
                placeholder = playerStack.pop();
                System.out.println(placeholder);
                discardStack.push(placeholder);
            }

            // DISCARD DRAWING (discardStack to playerStack)
            x = random.nextInt(6) + 1;
            System.out.println("\n Cards displaced: " + x);

            for (int i = 0; i < x; i++) {
                if (discardStack.isEmpty()) {
                    break;
                }
                System.out.println(" \n DRAWN FROM DISCARD PILE: ");
                Card placeholder;
                placeholder = discardStack.pop();
                System.out.println(placeholder);
                playerStack.push(placeholder);
            }

            System.out.println("\n ===== TURN 1 RESULTS =====");
            System.out.println("\n CARDS HELD: ");
            playerStack.printStack();

            System.out.println("\n NUMBER OF REMAINING CARDS: ");
            System.out.println(deckStack.size());

            System.out.println("\n NUMBER OF CARDS IN THE DISCARDED PILE: ");
            System.out.println(discardStack.size());

            System.out.println("\n Press ENTER to proceed.");
            scanner.nextLine();
        }

        scanner.close();
    }
}