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

        public boolean search(int key)
        {
            if(head == null)
                return false;
    
            Node temp = head;
    
            do
            {
                if(temp.data == key)
                    return true;
                temp = temp.next;
    
            }while(temp != head);
    
            return false;
        }

    public static void main(String args[])
    {

        CircularLinkedList list = new CircularLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Circular Linked List: 10->20->30->10");

        System.out.println("Searching Element: "+20);
        if(list.search(20))
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
