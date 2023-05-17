import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        int x = 10;
        HashSet<Integer> u = new HashSet<Integer>(); 
        for (int i = 0; i <= x; i++) {
            int y = 2 * i + 1;
            int z = 3 * i + 1;
            u.add(y);
            u.add(z);
        }
        System.out.println("Уникальные значения ряда u:");
        for (int num : u) {
            System.out.print(num + " ");
        }
    }
}
