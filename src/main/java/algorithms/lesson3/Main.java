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

        for (ListNode.Node node = listNode.getHead(); node != null; node = node.getNext())
            System.out.print(node.getValue() + " ");
    }

}
