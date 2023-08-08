public class Queue {
    int[] queue;
    int front = 0;  // Initialize front to 0
    int rear = -1;
    int size = 0;   // Track the number of elements in the queue
    int capacity;

    public Queue(int length) {
        queue = new int[length];
        capacity = length;
    }

    void add(int a) {
        if (size == capacity) {
            System.out.println("overflow");
            return;
        }
        if (rear == capacity - 1) {
            rear = -1;
        }
        queue[++rear] = a;
        size++;
    }

    void remove() {
        if (size == 0) {
            System.out.println("underflow");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }

    void show() {
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.println(queue[index]);
            index = (index + 1) % capacity;
            count++;
        }
    }
}
