package DataStructures.Stacks;

import java.util.ArrayList;
import DataStructures.Interfaces.Stack;

public class ArrayListStack<E> implements Stack<E> {
    // Instance Variables
    ArrayList<E> a;
    final static int CAPACITY = 1000;
    int top = -1;
    // Constructors
    public ArrayListStack() {
        this(CAPACITY);
    }
    public ArrayListStack(int capacity) {
        a = new ArrayList<>(capacity);
    }
    // Getter Methods
    public int size() { return top + 1; }
    public boolean isEmpty() { return (top == -1); }
    public E top() {
        if(isEmpty()) { return null; }
        return a.get(top);
    }
    public E pop() {
        E temp = null;
        if(top != -1) {
            temp = a.get(top);
            top--;
        } else {
            System.out.println("This stack is empty.");
        }
        return temp;
    }
    // Setter Method
    public void push(E e) {
        top++;
        if(top < CAPACITY) {
            a.add(top, e);
        } else {
            System.out.println("This stack is full, not supposed to double its capacity.");
        }
    }
}
