public class MyHashMap<K, V> {
    private Node<K, V>[] buckets;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> newNode = new Node<>(key, value);
        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node<K, V> current = buckets[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newNode;
            }
        }
        size++;
    }

    public void remove(K key) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            return;
        }
        if (buckets[index].key.equals(key)) {
            buckets[index] = buckets[index].next;
            size--;
            return;
        }
        Node<K, V> current = buckets[index];
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void clear() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}