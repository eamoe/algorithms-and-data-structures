package algorithms.lesson3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListNode implements Iterable<Integer> {
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
        this.head = previous;
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

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public Integer next() {
                if (hasNext()) {
                    Integer value = current.value;
                    current = current.next;
                    return value;
                }
                return null;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
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
