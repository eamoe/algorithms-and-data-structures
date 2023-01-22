package algorithms.lesson3;

public class ListNode {
    Node head;

    public Node getHead() {
        return head;
    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Node removeFirst(Node node) {
        if (head == null) {
            return null;
        }
        Node removedNode = head;
        head = head.next;
        return removedNode;
    }

    public Node reverse(Node node) {
        Node previous = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;
    }

    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public static class Node {
        int value;
        Node next;
        Node previous;

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }
    }

}
