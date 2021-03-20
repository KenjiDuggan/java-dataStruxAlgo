package DataStructures.Stacks;

import DataStructures.Interfaces.Stack;

public class ArrayStack<E> implements Stack<E> {
    // Instance Variables
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    // Constructors
    public ArrayStack() { this(CAPACITY); }
    public ArrayStack(int capacity) {
        data = (E[])new Object[capacity];
    }
    // Getter Methods
    public int size() { return t + 1; }
    public boolean isEmpty() { return (t == -1); }
    public E top() {
        if(isEmpty()) { return null; }
        return data[t];
    }
    public E pop() {
        if(isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    // Setter Method
    public void push(E e) throws IllegalStateException {
        if(size() == data.length) { throw new IllegalStateException(); }
        data[++t] = e;
    }
}
