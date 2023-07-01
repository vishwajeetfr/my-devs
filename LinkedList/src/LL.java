public class LL
{
    Node head;
    void insertAtHead(int data)
    {
        Node temp = new Node(data);

        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node tail = head;
            while(tail.next!=null)
            {
                tail = tail.next;
            }
            tail.next = temp;
        }
    }
    void insertAtIndex(int index, int data)
    {
        Node cur = head;
        Node in = new Node(data);
        int i = 0;
        while(i!=index)
        {
            cur = cur.next;
            i++;
        }
        Node temp = cur.next;
        cur.next = in;
        in.next = temp;
    }
    void print()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }

}