import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList =  new ArrayList<Player>();
        playerList.add(new Player(1, "Saitama", 999)); //adding a player to the array list
        playerList.add(new Player(2, "Deku", 100));
        playerList.add(new Player(3, "Saiki K", 500));

        // initial contents of the list
        System.out.println("Initial");
        printArrayList(playerList);

        // get an element from a list by index
//        int playerIndex = 1; // define an arbitrary integer for the index
//        System.out.println("\nGet element " + playerIndex);
//        System.out.println(playerList.get(playerIndex));
//
//        // insert an element
//        System.out.println("\n Insert element at " + playerIndex);
//        playerList.add(playerIndex, new Player(4, "Sakamoto", 10));
//        printArrayList(playerList);
//
//        // remove an element
//        playerIndex = 0;
//        System.out.println("\nRemove element at " + playerIndex);
//        playerList.remove(playerIndex);
//        printArrayList(playerList);

        // check if player is in the list
        System.out.println("\nCheck if player exists");
         boolean found = playerList.contains(new Player(3, "Saiki K", 500));
         int foundIndex = playerList.indexOf(new Player(3, "Saiki K", 500));
        System.out.println("Found player? " + found + " at index " + foundIndex);
   }

   private static void printArrayList(List<Player> players) {
//         for loop
       for (Player p : players) {
           System.out.println(p);
       }
   }
}
