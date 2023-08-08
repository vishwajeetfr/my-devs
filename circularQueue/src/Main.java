public class Main {
    public static void main(String[] args)
    {
       Queue q = new Queue(4);
       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       q.show();
       q.remove();
       q.remove();
       q.add(11);
       q.add(22);
       q.show();
    }
}