package task3_2;

public class Binarytree {
    Node root = null;
    public static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void add(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node currentNode = root;
        while (true) {
            if (currentNode.left != null && currentNode.left.value > value)
                currentNode = currentNode.left;
            else if (currentNode.right != null && currentNode.right.value >= value)
                currentNode = currentNode.right;
            else
                break;
        }
        if (currentNode.right == null && currentNode.value < value)
            currentNode.right = node;
        else if (currentNode.left == null && currentNode.value > value)
            currentNode.left = node;
    }

    public boolean check(int value) {
        Node currentNode = root;
        while (true) {
            if (currentNode.value == value)
                return true;
            else if (currentNode.left != null && currentNode.left.value >= value)
                currentNode = currentNode.left;
            else if (currentNode.right != null && currentNode.right.value >= value)
                currentNode = currentNode.right;
            else
                return false;
        }
    }
}
