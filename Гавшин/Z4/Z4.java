public class HashTable {
    private static final int SIZE = 10; // Размер таблицы
    private Entry[] table; // Массив записей

    public HashTable() {
        table = new Entry[SIZE];
        // Инициализируем массив записей
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
        }
    }

    // Класс, представляющий запись в хеш-таблице
    class Entry {
        int key;
        String value;
        Entry next;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // Метод для вычисления хеша
    private int getHash(int key) {
        return key % SIZE;
    }

    // Метод для добавления записи в хеш-таблицу
    public void put(int key, String value) {
        int hash = getHash(key);
        Entry newEntry = new Entry(key, value);

        if (table[hash] == null) {
            // Если нет записи с таким хешем, просто добавляем новую запись
            table[hash] = newEntry;
        } else {
            // Если уже есть запись с таким хешем, добавляем новую запись в конец связанного списка
            Entry current = table[hash];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }

    // Метод для получения значения по ключу
    public String get(int key) {
        int hash = getHash(key);

        if (table[hash] == null) {
            // Если нет записи с таким хешем, возвращаем null
            return null;
        } else {
            // Если есть запись с таким хешем, ищем запись с нужным ключом в связанном списке
            Entry current = table[hash];
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }
                current = current.next;
            }
            // Если запись с нужным ключом не найдена, возвращаем null
            return null;
        }
    }

    // Метод для удаления записи по ключу
    public void remove(int key) {
        int hash = getHash(key);

        if (table[hash] != null) {
            // Если есть запись с таким хешем, ищем запись с нужным ключом в связанном списке
            Entry current = table[hash];
            Entry previous = null;

            while (current != null) {
                if (current.key == key) {
                    // Если найдена запись с нужным ключом, удаляем ее из связанного списка
                    if (previous == null) {
                        // Если удаляемая запись - первая в списке
                        table[hash] = current.next;
                    } else {
                        // Если удаляемая запись - не первая в списке
                        previous.next = current.next;
                    }
                    return;
                }

                previous = current;
                current = current.next;
            }
        }
    }

    // Пример использования
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(1, "Value1");
        hashTable.put(2, "Value2");
        hashTable.put(11, "Value3");
        hashTable.put(12, "Value4");

        System.out.println(hashTable.get(1)); // Выводит "Value1"
        System.out.println(hashTable.get(11)); // Выводит "Value3"

        hashTable.remove(2);
        System.out.println(hashTable.get(2)); // Выводит null
    }
}
