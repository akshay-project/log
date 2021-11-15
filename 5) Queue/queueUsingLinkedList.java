class Node
{ 
    int data;
    Node next;
}

public class Queue
{
    Node front = null, rear = null;

    public void enqueue(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(front == null && rear == null)
            front = rear = newNode;
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue()
    {
        if(front == null)
            System.out.println("Queue is Empty");
        else
        {
            System.out.println("Dequeued Element = "+front.data);

            front = front.next;

            if(front == null)
                rear = null;
        }
    }
    
    public static void main(String args[])
    {

          Queue list = new Queue();

          list.dequeue();

          System.out.println("Enqueuing element: "+10);
          list.enqueue(10);
          System.out.println("Enqueuing element: "+20);
          list.enqueue(20);
          System.out.println("Enqueuing element: "+30);
          list.enqueue(30);

          list.dequeue();
          list.dequeue();
          list.dequeue();
          list.dequeue();
    }
}
