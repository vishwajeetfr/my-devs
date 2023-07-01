class LL
{
    Node head;
    void InsertAtTail (int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
        }
        else
        {
            Node tail = head;
            while (tail.nxt!=null)
            {
                tail=tail.nxt;
            }
            tail.nxt=temp;
        }

    }
    void print()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.nxt;
        }
    }
}
