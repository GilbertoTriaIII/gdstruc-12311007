public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(1, "Pikachu", 10);
        Player celebi = new Player(2, "Celebi",  20);
        Player hitmonchan = new Player(3, "Hitmonchan",  20);
        Player mankey = new Player(4, "Mankey",  20);
        Player starmie = new Player(5, "Starmie",  20);
        Player togepi = new Player(6, "Togepi",  20);

        SimpleHashTable players = new SimpleHashTable();

        players.put(pikachu.getUsername(), pikachu);
        players.put(celebi.getUsername(), celebi);
        players.put(hitmonchan.getUsername(), hitmonchan);

        System.out.println("Before collision: ");
        players.printHashTable();


        players.put(mankey.getUsername(), mankey);
        players.put(starmie.getUsername(), starmie);
        players.put(togepi.getUsername(), togepi);

        System.out.println("\nAfter collision: ");
        players.printHashTable();

        // test retrieving a value
        String key = starmie.getUsername();
        System.out.println("\nPlayer at key " + key + " = " + players.get(key));

        System.out.println("\n Removing: " + key + " = " + players.get(key));
        players.remove("Starmie");

        System.out.println("\nAfter removal: ");
        players.printHashTable();



    }
}
