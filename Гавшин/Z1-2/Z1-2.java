import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size) {
        matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    public int L() {
        int v = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                v -= matrix[i][j];
            }
        }
        return v;
    }

    public int H() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int M() {
        int d = 1;
        for (int i = 0; i < matrix.length; i++) {
            d *= matrix[i][i];
        }
        return d;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.print();
        System.out.println("Произведение диагонали: " + matrix.M());
        System.out.println("Сумма чисел выше диагонали: " + matrix.H());
        System.out.println("Разность чисел ниже диагонали: " + matrix.L());
    }

    public void print() {
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.printf("%2d", el);
            }
            System.out.println();
        }
    }
}
