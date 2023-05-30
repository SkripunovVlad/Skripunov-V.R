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
    public int M() {
        int dpr = 1;
        for (int i = 0; i < matrix.length; i++) {
            dpr *= matrix[i][i];
        }
        return dpr;
    }
    public int H() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    public int L() {
        int vb = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                vb -= matrix[i][j];
            }
        }
        return vb;
    }
    public void printMatrix() {
        System.out.println("Матрица:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%2d", element);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.printMatrix();
        System.out.println("Произведение диагонали:" + matrix.M());
        System.out.println("Сумма чисел выше дигонали:" + matrix.H());
        System.out.println("Разность чисел ниже диагонали:" + matrix.L());
    }
}
