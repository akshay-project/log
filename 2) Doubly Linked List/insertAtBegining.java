class Node
{   
    int data;
    Node prev;
    Node next;
}

public class DoublyLinkedList
{
    Node head;

    public void addFirst(int val)
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

            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
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
        list.addFirst(10);
        System.out.println("Inserting Element: "+20);
        list.addFirst(20);
        System.out.println("Inserting Element: "+30);
        list.addFirst(30);
        System.out.println("Inserting Element: "+40);
        list.addFirst(40);

        list.print();
    }
}
