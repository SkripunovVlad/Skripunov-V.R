public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Метод для добавления элемента в конец списка
    public void add(int key) {
        Node newNode = new Node(key);
        if (head == null) {
            // Если список пуст, новый элемент становится головой списка
            head = newNode;
        } else {
            Node current = head;
            // Находим последний элемент списка
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // Присоединяем новый элемент к последнему элементу
            current.setNext(newNode);
        }
    }

    // Метод для удаления элемента из списка
    public void remove(int key) {
        if (head == null) {
            // Если список пуст, ничего не делаем
            return;
        }

        if (head.getKey() == key) {
            // Если элемент для удаления - голова списка, переустанавливаем голову
            head = head.getNext();
        } else {
            Node current = head;
            // Ищем элемент для удаления
            while (current.getNext() != null) {
                if (current.getNext().getKey() == key) {
                    // Если найден элемент, перескакиваем через него, удаляя его из списка
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }
        }
    }

    // Метод для поиска элемента в списке
    public Node search(int key) {
        Node current = head;
        // Ищем элемент с заданным ключом
        while (current != null) {
            if (current.getKey() == key) {
                // Если найден элемент, возвращаем его
                return current;
            }
            current = current.getNext();
        }
        // Если элемент не найден, возвращаем null
        return null;
    }

    // Метод для вывода элементов списка на экран
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

        // Добавляем элементы в список
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display(); // Вывод: 1 2 3 4

        // Удаляем элемент из списка
        list.remove(3);
        list.display(); // Вывод: 1 2 4

        // Ищем элемент в списке
        Node foundNode = list.search(2);
        if (foundNode != null) {
            System.out.println("Найден элемент с ключом 2");
        } else {
            System.out.println("Элемент с ключом 2 не найден");
        }
    }
}
