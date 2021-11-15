class Queue
{ 
    static final int SIZE = 3;
    int arr[] = new int[SIZE];

    int front = 0;
    int rear = 0;

    public void enqueue(int val)
    {
        if(rear == SIZE)
            System.out.println("Queue is Full");
        else
        {
            arr[rear] = val;
            rear++;
        }
    }

    public void dequeue()
    {
        if(front == rear)
            System.out.println("Queue is Empty");
        else
        {
            System.out.println("Dequeued element = "+arr[front]);
            front++;
        }
    }

    public static void main(String args[])
    {
        Queue q = new Queue();

        System.out.println("Enqueuing element: "+10);
        q.enqueue(10);
        System.out.println("Enqueuing element: "+20);
        q.enqueue(20);
        System.out.println("Enqueuing element: "+30);
        q.enqueue(30);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}