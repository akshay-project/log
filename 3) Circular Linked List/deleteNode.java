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
    
    public void delete(int key)
    {
        if(head == null)
            return;

        if(head.data == key && head.next == head)
        {
            head = null;
        }
        else if(head.data == key)
        {
            Node last = head;

            while(last.next != head)
            {
                last = last.next;
            }
            last.next = head.next;
            head = head.next;
        }
        else
        {
            Node current = head;

            while(current.next != head)
            {
                if(current.next.data == key)
                {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
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
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Circular Linked List: 10->20->30->10");

        int key = 20;
        System.out.println("Deleting Element: "+key);
        list.delete(key);

        System.out.println("After Deletion");
        list.print();
    }
}