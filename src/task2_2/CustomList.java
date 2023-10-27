package task2_2;

public class CustomList {
    private Node head;

    public int getLength() {
        return length;
    }

    private int length = 0;
    public CustomList() {
        head = null;
    }
    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public void add(int value) {
        if (head == null)
            head = new Node(value);
        else {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = new Node(value);
        }
        length++;
    }
    public int get(int number) {
        if (number == 0 && head != null)
            return head.value;
        else {
            int i = 1;
            assert head != null;
            Node node = head.next;
            while (i++ != number) {
                if (node.next == null)
                    return -1;
                node = node.next;
            }
            return node.value;
        }
    }
    public void delete(int number) {
        if (number == 0 && head != null) {
            head = head.next;
        }
        else {
            int i = 1;
            assert head != null;
            Node node = head.next;
            Node prevNode = head;
            while (i++ != number) {
                prevNode = node;
                node = node.next;
            }
            if (node.next != null)
                prevNode.next = node.next;
            else
                prevNode.next = null;
        }
        length--;
    }
}
