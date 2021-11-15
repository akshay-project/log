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

    public boolean search(int key)
    {
        Node temp = head;

        while(temp != null)
        {
            if(temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    public static void main(String args[])
    {

        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Doubly Linked List: null<-10<->20<->30<->40->null");

        System.out.println("Searching Element: "+30);
        if(list.search(30))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");

        System.out.println("Searching Element: "+100);
        if(list.search(100))
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");
    }
}

