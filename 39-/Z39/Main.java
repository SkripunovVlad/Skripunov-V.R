import java.util.Arrays;

public class Main {

    public static int nextGreaterNumber(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int i = digits.length - 1;
        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }
        if (i <= 0) {
            return -1;
        }
        int j = digits.length - 1;
        while (digits[j] <= digits[i - 1]) {
            j--;
        }
        int temp = digits[i - 1];
        digits[i - 1] = digits[j];
        digits[j] = temp;
        Arrays.sort(digits, i, digits.length);
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 23;
        int nextNum = nextGreaterNumber(num);
        if (nextNum == -1) {
            System.out.println("Невозможно переставить цифры числа " + num);
        } else {
            System.out.println("Следующее большее число, которое можно составить, переставляя цифры числа " + num + " это " + nextNum);
        }
    }
}

