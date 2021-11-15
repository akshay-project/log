class Node
{ 
    int data;
    Node next;
}

public class CircularLinkedList
{
    Node head;

    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;

        if(head == null)
        {
            newNode.next = newNode;
            head = newNode;
        }
        else
        {
            Node last = head;

            while(last.next != head)
            {
                last = last.next;
            }

            last.next = newNode;
            newNode.next = head;
        }
    }

    public void print()
    {
        if(head == null)
            return;

        Node temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);
    }

    public static void main(String args[])
    {

        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Inserting Element: "+10);
        list.addLast(10);
        System.out.println("Inserting Element: "+20);
        list.addLast(20);
        System.out.println("Inserting Element: "+30);
        list.addLast(30);

        System.out.println("Circular Linked List Elements Are:");
        list.print();
    }
}
