package DataStructures.Lists;

public class SinglyLinkedList<E> {
    // Inner Node Class
    public static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    // Instance Variables For SinglyLinkedList
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() {}

    // Getter Methods
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        if(isEmpty()) { return null; }
        return head.getElement();
    }
    public E last() {
        if(isEmpty()) { return null; }
        return tail.getElement();
    }

    // Setter Methods
    public void addFirst(E e) {
        head = new Node<E>(e ,head);
        if(size == 0) { tail = head; }
        size++;
    }
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if(isEmpty()) { head = newest; }
        else { tail.setNext(newest); }
        tail = newest;
        size++;
    }
    public E removeFirst() { //return what was at first position
        if(isEmpty()) { return null; }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0) { tail = null; }
        return answer;
    }
}

