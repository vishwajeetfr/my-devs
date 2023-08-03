class MyQueue {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    final Node head;
    final Node tail;

    public MyQueue() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public void push(int x) {
        Node temp = new Node();
        temp.data = x;
        Node headnxt = head.next;
        head.next = temp;
        temp.prev = head;
        temp.next = headnxt;
        headnxt.prev = temp;
    }

    public int pop() {
        int data = tail.prev.data;
        Node nxt = tail.prev.next;
        Node prev = tail.prev.prev;
        nxt.prev = prev;
        prev.next = nxt;
        return data;
    }

    public int peek() {
        return tail.prev.data;
    }

    public boolean empty() {
        return tail.prev == head;
    }
}