class Node
{ 
    int data;
    Node prev;
    Node next;
}

public class DoublyLinkedList
{
    public static void main(String args[])
    {
        Node head, middle, last;

        head = new Node();
        middle = new Node();
        last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.prev = null;
        head.next = middle;
        middle.prev = head;
        middle.next = last;
        last.prev = middle;
        last.next = null;

        Node temp = head;
        System.out.println("Forward Traversal");
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

        temp = last;
        System.out.println("Backward Traversal");
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}