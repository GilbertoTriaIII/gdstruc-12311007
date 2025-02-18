import java.util.LinkedList;

public class PlayerLinkedList {
    private PlayerNode head;
    int size = 0;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
        size++;
    }

    public void printLinkedList() { // printing
        System.out.println("[HEAD] -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.println(current.getPlayer() + " ->");
            current = current.getNextPlayerNode();

        }
        System.out.println("NULL");
        System.out.println("\nSize: " + size);
    }

    public void removeHead() {
        head = head.getNextPlayerNode();
        size--;
    }

    public void checkPlayer() {

        System.out.println("\nCheck if player SAIKI K exists:");

        boolean varStatus = false;
        PlayerNode current = head;
        int index = 0;

        //checks both contains and index of
        Player findPlayer = new Player(3, "Saiki K", 500);
        while (current != null) {
            System.out.println("CHECKING: " + current.getPlayer());
            if (current.getPlayer() == findPlayer) {
                varStatus = true;
                System.out.println("Found player?" + varStatus + "\n at index: " + index);
                break;
            }
            current = current.getNextPlayerNode();
            index++;
        }
        if (current == null) {
            System.out.println("Player could not be found.");
        }
    }
}


