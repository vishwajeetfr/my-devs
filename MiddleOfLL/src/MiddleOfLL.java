public class MiddleOfLL {
    public static void main(String[] args)
    {
         LL ob1 = new LL();
         ob1.PushAtHead(5);
         ob1.PushAtHead(4);
         ob1.PushAtHead(3);
         ob1.PushAtHead(2);
         ob1.PushAtHead(1);
         Solution mid = new Solution();

        System.out.println(mid.middleNode(ob1.head).data);
    }
}