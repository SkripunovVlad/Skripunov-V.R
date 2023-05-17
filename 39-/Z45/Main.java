import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();
        if (years <= 0 || years > 9999) {
            System.out.println("Ошибка: количество лет должно быть больше 0 и меньше 10000");
            return;
        }
        String romanYears = convertToRoman(years);

        System.out.println(years + " лет = " + romanYears);
    }
    public static String convertToRoman(int number) {
        StringBuilder result = new StringBuilder();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(symbols[i]);
                number -= values[i];
            }
        }
        return result.toString();
    }
}

