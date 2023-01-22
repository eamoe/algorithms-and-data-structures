package algorithms.lesson3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        ListNode listNode = new ListNode();

        listNode.addFirst(12);
        listNode.addFirst(29);
        listNode.addFirst(11);
        listNode.addFirst(23);
        listNode.addFirst(8);

        ListNode.Node removedNode = listNode.removeFirst(listNode.getHead());
        System.out.println("Removed node value is " + removedNode.getValue());

        System.out.print("Linked list is ");
        for (Integer value : listNode) {
            System.out.print(value + " --> ");
        }

        System.out.println();

        ListNode.Node newHead = listNode.reverse(listNode.getHead());
        System.out.println("New head value is " + newHead.getValue());

        System.out.print("Reversed linked list is ");
        Iterator<Integer> resultIterator = listNode.iterator();
        while (resultIterator.hasNext()) {
            Integer value = resultIterator.next();
            System.out.print(value + " --> ");
        }
    }
}
