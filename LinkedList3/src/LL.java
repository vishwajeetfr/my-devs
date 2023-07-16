public class LL
{
    Node head;
    void InsertAtTail(int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node tail = head;
            while (tail.next != null)
            {
                tail=tail.next;
            }
            tail.next = temp;

        }
    }

    void insertAt(int val,int index)
    {
        Node temp = new Node(val);
        Node head1 = head;
        while(index>1)
        {
           head1 = head1.next;
           index--;
        }
        Node temp2 = head1.next;
        head1.next = temp;
        temp.next = temp2;
    }

    void print(Node n1)
    {
        while(n1!=null)
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
    }
    void search(int val)
    {
        Node temp = head;
        int count = 1;
        while(temp.data!=val)
        {
            temp= temp.next;
            count++;
        }
        System.out.println("value " + val + " is at " + count);
    }
    void delete(int index)
    {
        Node temp = head;
        for(int i =2; i<index;i++)
        {
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = temp2.next;
        System.out.println("index "+index+" has been deleted");
    }
}
