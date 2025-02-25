import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] playerArray;
    private int top;

    public ArrayStack(int capacity) {
        playerArray = new Player[capacity]; //initializing our player array
        top = -1;
    }

    //push operation
    public void push(Player player)
    {
        // stack is full // this whole code only happens when array is at FULL CAPACITY
        if (top == playerArray.length - 1)
        { //mean stack is full (we need a checker) (cuz top points to the last index of the array)
            Player[] largerPlayerArray = new Player[playerArray.length * 2]; //we need to put it in a new array, so we double the capacity
            System.arraycopy(playerArray, 0, largerPlayerArray, 0, playerArray.length);
            playerArray = largerPlayerArray; //we make the new larger array the array of our stack!
        }

        //assigning our new top element
        playerArray[++top] = player; //we increase the value of TOP integer -> becomes index of playerArray[],
        // also the index will be incremented first, then itll be the new index of playerArray
    }
    public Player pop()  //no need for parameter cuz we know we r popping the top element
    {
        if (isEmpty())     //stack is empty, itll throw an error
        {
            throw new EmptyStackException(); //handles the error so that the program can still continue :D
        }

        return playerArray[top--]; //caches top element, then after this function, top = -1
    }

    public Player peek() //returning the top element
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return playerArray[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public void printStack() //utility function that verifies our stack
    {
        for (int i = top; i >= 0; i--)
        {
            System.out.println(playerArray[i]);
        }
    }
}
