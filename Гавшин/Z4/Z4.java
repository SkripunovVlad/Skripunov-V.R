import java.util.HashMap;
import java.util.Map;
class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}
public class Main {
    public static void main(String[] args) {
        // Создание хеш-таблицы для хранения книг и количества копий
        HashMap<Book, Integer> library = new HashMap<>();
        // Создание объектов книг
        Book book1 = new Book("Сказка о рыбаке и рыбке", "Александр Пушкин");
        Book book2 = new Book("Вишнёвый сад", "Анатолий Чехов");
        Book book3 = new Book("Муму", "Иван Тургенев");
        // Добавление книг в хеш-таблицу с указанием количества копий
        library.put(book1, 5);
        library.put(book2, 3);
        library.put(book3, 7);
        // Итерация по хеш-таблице и вывод информации о каждой книге
        for (Map.Entry<Book, Integer> entry : library.entrySet()) {
            Book book = entry.getKey();
            int copies = entry.getValue();
            System.out.println("В библиотеке имеется " + copies + " копий книги \"" + book.getTitle() + "\"");
        }
    }
}

