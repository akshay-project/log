class Node
{ 
    int data;
    Node prev;
    Node next;
}

public class DoublyLinkedList
{
    Node head;

    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;

        if(head == null)
        {
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }
        else
        {
            Node last = head;

            while(last.next != null)
            {
                last = last.next;
            }

            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
        }
    }

    public void print()
    {
        Node temp = head;
        Node last = null;

        System.out.println("Forward Traversal");
        while(temp != null)
        {
            System.out.println(temp.data);
            if(temp.next == null)
                last = temp;
            temp = temp.next;
        }

        System.out.println("Backward Traversal");
        temp = last;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String args[])
    {

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Inserting Element: "+10);
        list.addLast(10);
        System.out.println("Inserting Element: "+20);
        list.addLast(20);
        System.out.println("Inserting Element: "+30);
        list.addLast(30);
        System.out.println("Inserting Element: "+40);
        list.addLast(40);

        list.print();
    }
}
