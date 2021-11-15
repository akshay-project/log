class Node
{   
    int data;
    Node next;
}

public class LinkedList
{
    Node head;

    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null)
            head = newNode;
        else
        {
            Node lastNode = head;

            while(lastNode.next != null)
            {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
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
    
    public void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {

          LinkedList list = new LinkedList();
          list.addLast(10);
          list.addLast(20);
          list.addLast(30);
          list.addLast(40);

          System.out.println("The LinkedList Elements Are:");
          list.print();

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