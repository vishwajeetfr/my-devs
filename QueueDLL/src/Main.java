public class Main {
    public static void main(String[] args)
    {
        MyQueue q1 = new MyQueue();
        q1.push(5);
        q1.push(6);
        q1.push(7);
        System.out.println(q1.pop());
        System.out.println(q1.peek());
    }
}