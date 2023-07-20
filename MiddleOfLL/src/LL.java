public class LL
{
    Node head;
    void PushAtHead(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            temp.next = head;
            head = temp;
        }
    }

}
