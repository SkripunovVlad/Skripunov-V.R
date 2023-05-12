package Main;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static int fibonacci(int num) {
        if (num < 2) {
            return num;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static int[] fibonacciDigit(int num) {
        if (num < 10 || num > 100000) {
            return null;
        }
        int fibNum = fibonacci(num);
        // находим наибольшее вхождение цифры в числе
        Map<Character, Integer> digitCount = new HashMap<>();
        for (char digit : String.valueOf(fibNum).toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }
        int maxCount = 0, maxDigit = 0;
        for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
            if (entry.getValue() > maxCount || (entry.getValue() == maxCount && entry.getKey() > maxDigit)) {
                maxCount = entry.getValue();
                maxDigit = entry.getKey();
            }
        }
        return new int[]{maxCount, maxDigit - '0'};
    }
    public static void main(String[] args) {
        int[] result = fibonacciDigit(10);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // [2, 5]

        result = fibonacciDigit(50);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // [12, 1]
    }
}

