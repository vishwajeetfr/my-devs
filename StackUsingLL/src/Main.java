public class Main {
    public static void main(String[] args)
    {
        LinkedList ob1 = new LinkedList();
        ob1.push(1);
        ob1.push(2);
        ob1.push(3);
        ob1.print(ob1.head);
        ob1.pop();
        ob1.print(ob1.head);
    }
}