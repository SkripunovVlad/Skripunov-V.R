public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Добавление элементов
        list.add(1, "Элемент 1");
        list.add(2, "Элемент 2");
        list.add(3, "Элемент 3");
        list.add(4, "Элемент 4");
        list.add(5, "Элемент 5");
        list.add(6, "Элемент 6");

        // Поиск элемента по ключу
        Object element = list.search(5);
        System.out.println("Элемент с ключом 5: " + element);

        // Удаление элемента по ключу
        list.remove(5);

        // Проверка, что элемент удален
        element = list.search(5);
        System.out.println("Элемент с ключом 5 (после удаления): " + element);
    }
}
