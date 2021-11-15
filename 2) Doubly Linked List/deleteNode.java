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

    public void delete(int key)
    {
        if(head == null)
            return;

        Node temp = head;

        while(temp != null && temp.data != key)
        {
            temp = temp.next;
        }

        if(temp == null)
            System.out.println("Key Not Found");
        else if(temp == head)
        {
            head = head.next;
            head.prev = null;
        }
        else if(temp.next == null)
            temp.prev.next = null;
        else
        {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
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
          list.addLast(10);
          list.addLast(20);
          list.addLast(30);
          list.addLast(40);

          System.out.println("Doubly Linked List: null<-10<->20<->30<->40->null");

          int key = 20;
          System.out.println("Deleting Element: "+key);
          list.delete(key);

          System.out.println("After Deletion");
          list.print();
    }
}