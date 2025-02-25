import java.util.LinkedList;
import java.util.ListIterator;

public class DiscardStack {
    LinkedList<Card> discardStack;

    public DiscardStack() {
        discardStack = new LinkedList<Card>();
    }

    public void push(Card card) {
        discardStack.push(card);
    }

    public Card pop()
    {
        return discardStack.pop();
    }

    public Card peek()
    {
        return discardStack.peek();
    }

    public boolean isEmpty() {
        return discardStack.isEmpty();
    }

    public void printStack()
    {
        ListIterator listIterator = discardStack.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }

    public int size() {
        return discardStack.size();
    }

}

