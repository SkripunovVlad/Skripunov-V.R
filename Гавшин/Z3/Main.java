public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Добавление элементов
        list.add(1, "Элемент 1");
        list.add(2, "Элемент 2");
        list.add(3, "Элемент 3");

        // Поиск элемента по ключу
        Object element = list.search(2);
        System.out.println("Элемент с ключом 2: " + element);

        // Удаление элемента по ключу
        list.remove(2);

        // Проверка, что элемент удален
        element = list.search(2);
        System.out.println("Элемент с ключом 2 (после удаления): " + element);
    }
}

