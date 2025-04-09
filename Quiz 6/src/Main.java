public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        System.out.println("In ascending order: ");
        tree.inOrderTraverse();

        System.out.println("In descending order: ");
        tree.traverseInOrderDescending();

        int searchValue = 27;
        System.out.println("Node for value " + searchValue + " = " + tree.get(searchValue));

        System.out.println("Min node:" + tree.getMin());
        System.out.println("Max node:" + tree.getMax());

    }
}
