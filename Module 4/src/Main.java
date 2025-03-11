import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            List<Player> playerList =  new ArrayList<Player>();
            playerList.add(new Player(1, "Zeus", 999)); //adding a player to the array list
            playerList.add(new Player(2, "Poseidon", 100));
            playerList.add(new Player(3, "Hera", 500));
            playerList.add(new Player(4, "Hestia", 500));
            playerList.add(new Player(5, "Hermes", 500));
            playerList.add(new Player(6, "Artemis", 500));
            playerList.add(new Player(7, "Aphrodite", 500));
            playerList.add(new Player(8, "Ares", 500));
            playerList.add(new Player(9, "Apollo", 500));
            playerList.add(new Player(10, "Demeter", 500));
            playerList.add(new Player(11, "Dionysus", 500));
            playerList.add(new Player(12, "Athena", 500));
            playerList.add(new Player(13, "Hades", 500));
            playerList.add(new Player(14, "Zeus", 999)); //adding a player to the array list
            playerList.add(new Player(15, "Poseidon", 100));
            playerList.add(new Player(16, "Hera", 500));
            playerList.add(new Player(17, "Hestia", 500));
            playerList.add(new Player(18, "Hermes", 500));
            playerList.add(new Player(19, "Artemis", 500));
            playerList.add(new Player(20, "Aphrodite", 500));
            playerList.add(new Player(21, "Ares", 500));
            playerList.add(new Player(22, "Apollo", 500));
            playerList.add(new Player(23, "Demeter", 500));
            playerList.add(new Player(24, "Dionysus", 500));
            playerList.add(new Player(25, "Athena", 500));
            playerList.add(new Player(26, "Hades", 500));
            playerList.add(new Player(27, "Zeus", 999)); //adding a player to the array list
            playerList.add(new Player(28, "Poseidon", 100));
            playerList.add(new Player(29, "Hera", 500));
            playerList.add(new Player(30, "Hestia", 500));
            playerList.add(new Player(31, "Hermes", 500));
            playerList.add(new Player(32, "Artemis", 500));
            playerList.add(new Player(33, "Aphrodite", 500));
            playerList.add(new Player(34, "Ares", 500));
            playerList.add(new Player(35, "Apollo", 500));
            playerList.add(new Player(36, "Demeter", 500));
            playerList.add(new Player(37, "Dionysus", 500));
            playerList.add(new Player(38, "Athena", 500));
            playerList.add(new Player(39, "Hades", 500));

            PlayerQueue players = new PlayerQueue(20);

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Initial player list: ");
            printArrayList(playerList);

            int game = 0;


            while (game < 10) {
                boolean gameCondition = false;

                int index = 0;

                while (!gameCondition) {
                    int x = random.nextInt(7) + 1;

                    //loop

                    for (int i = 0; i < x; i++) {
                        players.enqueue(playerList.get(index));
                        index++;
                    }

                    // condition for the game to start ending
                    if (players.size() >= 5) {
                        gameCondition = true;
                    }

                    System.out.println("\n PLAYERS IN QUEUE: \n");
                    players.printQueue();
                    scanner.nextLine();
                }

                // game "starts"
                game++;
                System.out.print("\n =================== GAME: " + game + " =====================\n");
                System.out.println("QUEUED PLAYERS: \n");
                players.printQueue();

                //removes 5 players
                System.out.println("\nDEQUEING PLAYERS: ");

                for (int i = 0; i < 5; i++) {
                    Player removedPlayer = players.dequeue();
                    System.out.println("Removed player " + removedPlayer);
                }



            }


    /*    PlayerQueue players = new PlayerQueue(10);

        players.enqueue(new Player(1, "Deku", 100));
        players.enqueue(new Player(2, "Saitama", 999));
        players.enqueue(new Player(3, "Saiki K", 500));

        // print initial queue
        System.out.println("Initial Queue");
        players.printQueue();

        // enqueue new player
        players.enqueue(new Player(5, "Sakamoto", 10));
        players.printQueue();

        // dequeue a player
        System.out.println("\nDequeue player");
        Player removePlayer = players.dequeue();
        System.out.println("Removed player " + removePlayer + " New front " + players.peek());*/
            scanner.close();
        }



    private static void printArrayList(List<Player> players) {
//         for loop
        for (Player p : players) {
            System.out.println(p);
        }
    }
}


