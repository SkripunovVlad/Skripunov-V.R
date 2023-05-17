import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лет в римской нотации: ");
        String romanYears = scanner.nextLine().toUpperCase();
        int years = convertToArabic(romanYears);
        System.out.println(romanYears + " = " + years + " лет");
    }
    public static int convertToArabic(String roman) {
        HashMap<Character, Integer> romanToArabic = new HashMap<>();
        romanToArabic.put('I', 1);
        romanToArabic.put('V', 5);
        romanToArabic.put('X', 10);
        romanToArabic.put('L', 50);
        romanToArabic.put('C', 100);
        romanToArabic.put('D', 500);
        romanToArabic.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanToArabic.get(roman.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}

