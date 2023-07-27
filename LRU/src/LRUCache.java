import java.util.HashMap;

class LRUCache {
    class Node
    {
        int key;
        int val;
        Node next;
        Node prev;
    }
    int c;
    final Node head = new Node();
    final Node tail = new Node();
    HashMap<Integer, Node> map;

    public LRUCache(int capacity)
    {
        map = new HashMap<>(capacity);
        this.c = capacity;
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key)
    {
        int result = -1;
        Node node = map.get(key);
        if(node!=null)
        {
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }

    public void put(int key, int value)
    {
        Node node = map.get(key);
        if(node!=null)
        {
            remove(node);
            node.val = value;
            add(node);
        }
        else
        {
            if(map.size() == c)
            {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node temp = new Node();
            temp.key = key;
            temp.val = value;
            map.put(key,temp);
            add(temp);
        }
    }

    void add(Node node)
    {
        Node headnxt = head.next;
        head.next = node;
        node.prev = head;
        node.next = headnxt;
        headnxt.prev = node;
    }

    void remove(Node node)
    {
        Node nxt = node.next;
        Node prev = node.prev;

        nxt.prev = prev;
        prev.next = nxt;
    }

}