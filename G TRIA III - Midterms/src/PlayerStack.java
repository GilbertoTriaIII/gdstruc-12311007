import java.util.LinkedList;
import java.util.ListIterator;

public class PlayerStack {
    LinkedList<Card> playerStack;

    public PlayerStack() {
        playerStack = new LinkedList<Card>();
    }

    public void push(Card card) {
        playerStack.push(card);
    }

    public Card pop()
    {
        return playerStack.pop();
    }

    public Card peek()
    {
        return playerStack.peek();
    }

    public void printStack() {
        ListIterator listIterator = playerStack.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }

    public  boolean isEmpty() {
        return playerStack.isEmpty();
    }


}

