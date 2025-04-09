public class Tree {
    private Node root;

    public void insert(int value) {
        // tree is empty -> it becomes the root node
        if (root == null) {
            root = new Node(value);
            return;
        }

        root.insert(value);
    }

    public void inOrderTraverse() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        root.inOrderTraverse();
    }

    public void traverseInOrderDescending() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        root.traverseInOrderDescending();
    }


    public Node get(int value) {
        if (root == null) {
            return null;
        }

        return root.get(value);
    }

    public Node getMin() {
        if (root != null) {
            return root.getMin();
        }
        return null;
    }

    public Node getMax() {
        if (root != null) {
            return root.getMax();
        }
        return null;
    }
}

