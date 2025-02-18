public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayerNode;

    public Player getPlayer() {
        return player;
    }

    public PlayerNode(Player player) {
        this.player = player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayerNode() {
        return nextPlayerNode;
    }

    public void setNextPlayerNode(PlayerNode nextPlayerNode) {
        this.nextPlayerNode = nextPlayerNode;
    }
}