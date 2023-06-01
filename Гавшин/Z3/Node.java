public class Node {
    private int key; // Ключ узла
    private Node next; // Ссылка на следующий узел

    public Node(int key) {
        this.key = key; // Инициализация ключа узла
        this.next = null; // Инициализация ссылки на следующий узел как null
    }

    public int getKey() {
        return key; // Возвращает ключ узла
    }

    public Node getNext() {
        return next; // Возвращает ссылку на следующий узел
    }

    public void setNext(Node next) {
        this.next = next; // Устанавливает ссылку на следующий узел
    }
}
