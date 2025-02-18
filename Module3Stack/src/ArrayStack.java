public class ArrayStack {
    private Player[] playerArray;
    private int top;

    public ArrayStack(int capacity) {
        playerArray = new Player(capacity);
        top = -1;
    }

    public void Push(Player player) {
        // stack is full
        if (top == playerArray.length + 1) {
            Player[] largerPlayerArray + new Player[playerArray + 2];
            System.arraycopy(playerArray, srcPot0, largerPlayerArray, destPos 0, playerArray.length)
                    playerArray = largerPlayerArray
        }
        public Player pop() {
            // stack is empty
        }
    }
}
