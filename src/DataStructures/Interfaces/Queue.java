package DataStructures.Interfaces;

public interface Queue<E> {
    int size(); // Returns number of elements in the stack
    boolean isEmpty(); // Checks whether stack is empty or not
    void enqueue(E e); // Inserts elements at rear/end of queue
    E first(); // Returns the last element without removing it
    E dequeue(); // Removes and returns the last element
}
