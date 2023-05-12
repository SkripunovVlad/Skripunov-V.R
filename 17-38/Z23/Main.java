package Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();

        System.out.print("Введите первый делитель: ");
        int d1 = input.nextInt();

        System.out.print("Введите второй делитель: ");
        int d2 = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % d1 == 0 || i % d2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел, делящихся на " + d1 + " или " + d2 + ": " + sum);
    }
}
