public class Main {
    public static void main(String[] args)
    {
        LL ob1 = new LL();
        ob1.InsertAtTail(1);
        ob1.InsertAtTail(2);
        ob1.InsertAtTail(3);
        ob1.insertAt(4,2);
        ob1.print(ob1.head);
        ob1.search(3);
        ob1.delete(3);
        ob1.print(ob1.head);
        ob1.search(3);
    }
}