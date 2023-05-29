public class LinkedList {
    private Node head;
    private class Node {
        private int key;
        private Object value;
        private Node next;
        public Node(int key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    public void add(int key, Object value) {
        Node newNode = new Node(key, value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void remove(int key) {
        if (head == null) {
            return;
        }

        if (head.key == key) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node current = head.next;
        while (current != null) {
            if (current.key == key) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public Object search(int key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}
