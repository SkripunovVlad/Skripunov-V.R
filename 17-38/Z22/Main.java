import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины сторон треугольника:");
        System.out.print("сторона a = ");
        double a = scanner.nextDouble();
        System.out.print("сторона b = ");
        double b = scanner.nextDouble();
        System.out.print("сторона c = ");
        double c = scanner.nextDouble();
        double area = calculateTriangleArea(a, b, c);
        System.out.println("Площадь треугольника: " + area);
    }
    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        return area;
    }
}
