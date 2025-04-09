public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

    public void insert(int value) {
        if (data == value) { //checks if the data is just the value
            return;
        }

        // check if tree is empty
        // if tree is empty -> new value will become the *root* of the tree

        if (value > data) { // is n greater than x? // the higher the value from the root, we go to the right side
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.insert(value); //this cycle will continue until there is a vacant (rightchild == null) right child
            }
        }

        else { //n is less than x so it goes on the left, so check: is the left child of the node still null?
            if (leftChild == null) { //yes -> so put a new
                leftChild = new Node(value);
            } else { // no -> u insert under the alr established left child
                leftChild.insert(value); //this cycle will continue until there is a vacant (leftchild == null) right child
            }
        }
    }

    public void inOrderTraverse() {
        if (leftChild != null) { //if left child exists, KEEP ON GOING DOWN until it's the leaf, then print
            leftChild.inOrderTraverse();
        }

        System.out.println("Node: " + data);

        // right child
        if (rightChild != null) {
            rightChild.inOrderTraverse();
        }

    }

  public Node getMin() {
        if (leftChild != null) { //left cause the leftmost item is the lowest number
          return leftChild.getMin(); //sends it back recursively
        }
        return this; //base case thingy that returns node with no left child, ends the recursion
    }

    public Node getMax() {
        if (rightChild != null) { //we going right cause the rightmost item is the highest number
            return rightChild.getMax(); //sends it back recursively
        }
        return this; //base case thingy that returns node with no right  child, ends the recursion
    }


    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value > data) { //right side
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        else { //left sidex
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }

        return null;
    }

    public void traverseInOrderDescending() {
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();
        }

        System.out.println("Node: " + data);

        // and then the left child
        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
        }
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}

