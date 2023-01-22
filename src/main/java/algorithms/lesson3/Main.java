package algorithms.lesson3;

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
        for (ListNode.Node node = listNode.getHead(); node != null; node = node.getNext()) {
            System.out.print(node.getValue() + " --> ");
        }
        System.out.println();

        System.out.print("Reversed linked list is ");
        ListNode.Node newHead = listNode.reverse(listNode.getHead());
        for (ListNode.Node node = newHead; node != null; node = node.getNext())
            System.out.print(node.getValue() + " --> ");

    }

}
