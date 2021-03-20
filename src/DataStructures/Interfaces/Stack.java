package DataStructures.Interfaces;

public interface Stack<E> {
    int size(); // Returns number of elements in the stack
    boolean isEmpty(); // Checks whether stack is empty or not
    void push(E e); // Inserts an element at the top of the stack
    E top(); // Returns the top element without removing it
    E pop(); // Removes and returns the top element
}
