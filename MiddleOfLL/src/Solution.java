class Solution {
    public Node middleNode( Node head)
    {
        int n = 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            n++;
        }
        Node temp2 = head;
        for(int i = 0; i<n/2;i++)
        {
            temp2 = temp2.next;
        }
        return temp2;
    }
}