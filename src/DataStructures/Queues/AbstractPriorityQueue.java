package DataStructures.Queues;
import DataStructures.Comparators.DefaultComparator;
import DataStructures.Interfaces.Entry;
import DataStructures.Interfaces.PriorityQueue;

import java.util.Comparator;

public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {
    // Inner Class Priority Queue Entry
    public static class PQEntry<K, V> implements Entry<K, V> {
        // Instance Variables
        private K k;
        private V v;
        // Constructors
        public PQEntry(K key, V value) {
            k = key;
            v = value;
        }
        // Getter Methods
        public K getKey() {
            return k;
        }
        public V getValue() {
            return v;
        }
        // Setter Methods
        protected void setKey(K key) {
            k = key;
        }
        protected void setValue(V value) {
            v = value;
        }
    }

    private Comparator<K> comp;
    protected AbstractPriorityQueue(Comparator<K> c) { comp = c; }
    protected AbstractPriorityQueue() { this(new DefaultComparator<K>()); }
    protected int compare(Entry<K, V> a, Entry<K, V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }
    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key, key) == 0);
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("Incompatible key.");
        }
    }
    public boolean isEmpty() { return size() == 0; }
}
