public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int key) {
        Node newNode = new Node(key);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void remove(int key) {
        if (head == null) {
            return;
        }

        if (head.getKey() == key) {
            head = head.getNext();
        } else {
            Node current = head;
            while (current.getNext() != null) {
                if (current.getNext().getKey() == key) {
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public Node search(int key) {
        Node current = head;
        while (current != null) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getKey() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display(); // Output: 1 2 3 4

        list.remove(3);
        list.display(); // Output: 1 2 4

        Node foundNode = list.search(2);
        if (foundNode != null) {
            System.out.println("Found node with key 2");
        } else {
            System.out.println("Node with key 2 not found");
        }
    }
}
