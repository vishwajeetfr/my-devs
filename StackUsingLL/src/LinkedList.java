public class LinkedList {
    Node head;
    void push(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            Node temp2 = head;
            head = temp;
            temp.next = temp2;
        }
    }
    void peek (Node head)
    {
        System.out.println(head.data);
    }
    void pop()
    {
        head = head.next;
    }
    void print(Node head)
    {
       while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

}
