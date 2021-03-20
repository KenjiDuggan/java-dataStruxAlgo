package DataStructures.Queues;

import DataStructures.Interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {
    // Instance Variables
    public static final int CAPACITY = 1000;
    private E[] data;
    private int f = 0;
    private int sz = 0;
    // Constructors
    public ArrayQueue() { this(CAPACITY)}
    public ArrayQueue(int capacity) { data = (E[])new Object[capacity]; }
    // Getter Methods
    public int size() { return sz; }
    public boolean isEmpty() { return (sz == 0); }
    public E first() {
        if(isEmpty()) { return null; }
        return data[f];
    }
    public E dequeue() {
        if(isEmpty()) { return null; }
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }
    // Setter Method
    public void enqueue(E e) throws IllegalStateException {
        if(sz == data.length) { throw new IllegalStateException("Queue is full."); }
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }
}
