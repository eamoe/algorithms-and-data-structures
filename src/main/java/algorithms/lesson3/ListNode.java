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

    public static Node reverse(Node node) {
        return node;
    }

    /* public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous  = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }*/

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
