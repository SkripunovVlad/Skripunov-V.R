public class Node {
    private int key;
    private Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

