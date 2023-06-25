import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size) {
        matrix = new int[size][size]; // Создаем новую матрицу указанного размера
        Random random = new Random(); // Создаем генератор случайных чисел
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10); // Заполняем матрицу случайными числами от 0 до 9
            }
        }
    }

    public int L() {
        int v = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                v -= matrix[i][j]; // Вычисляем отрицательную сумму чисел ниже главной диагонали
            }
        }
        return v; // Возвращаем результат
    }

    public int H() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j]; // Вычисляем сумму чисел выше главной диагонали
            }
        }
        return sum; // Возвращаем результат
    }

    public int M() {
        int d = 1;
        for (int i = 0; i < matrix.length; i++) {
            d *= matrix[i][i]; // Вычисляем произведение элементов главной диагонали
        }
        return d; // Возвращаем результат
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.print(); // Выводим матрицу на экран
        System.out.println("Произведение диагонали: " + matrix.M()); // Выводим произведение элементов главной диагонали
        System.out.println("Сумма чисел выше диагонали: " + matrix.H()); // Выводим сумму чисел выше главной диагонали
        System.out.println("Разность чисел ниже диагонали: " + matrix.L()); // Выводим отрицательную сумму чисел ниже главной диагонали
    }

    public void print() {
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.printf("%2d", el); // Выводим каждый элемент матрицы
            }
            System.out.println();
        }
    }
}
