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
    public int getDiagonalProduct() {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            product *= matrix[i][i];
        }
        return product;
    }
    public int getUpperSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
            }
        }
        return sum;
    }
    public int getLowerDiff() {
        int diff = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                diff -= matrix[i][j];
            }
        }
        return diff;
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
        System.out.println("Произведение главной диагонали:" + matrix.getDiagonalProduct());
        System.out.println("Сумма выше диагонали:" + matrix.getUpperSum());
        System.out.println("Разность под диагональю:" + matrix.getLowerDiff());
    }

} 
