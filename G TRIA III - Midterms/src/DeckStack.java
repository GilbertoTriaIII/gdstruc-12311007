import java.util.LinkedList;
import java.util.ListIterator;

public class DeckStack {
    LinkedList<Card> deckStack;

    public DeckStack() {
        deckStack = new LinkedList<Card>();
    }

    public void push(Card card) {
        deckStack.push(card);
    }

    public Card pop()
    {
        return deckStack.pop();
    }

    public Card peek()
    {
        return deckStack.peek();
    }

    public void printStack()
    {
        ListIterator listIterator = deckStack.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }
    public boolean isEmpty() {
        return deckStack.isEmpty();
    }

    public int size() {
        return deckStack.size();
    }
}

