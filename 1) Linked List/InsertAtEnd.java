class Node
{ 
    int data;
    Node next;
}

public class LinkedList
{
    Node head;

    public void addFirst(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }



    public static void main(String args[])
    {

          LinkedList list = new LinkedList();

          System.out.println("Inserting Element: "+10);
          list.addFirst(10);
          System.out.println("Inserting Element: "+20);
          list.addFirst(20);
          System.out.println("Inserting Element: "+30);
          list.addFirst(30);
          System.out.println("Inserting Element: "+40);
          list.addFirst(40);
          System.out.println("Inserting Element: "+40);
          list.addFirst(50);

          System.out.println("The LinkedList Elements Are:");
    
    }
}